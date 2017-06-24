package com.ol.action;

import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.Ulti;
import com.ol.model.entity.Employee;
import com.ol.model.entity.LoaDetail;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.Project;
import com.ol.model.service.AuthorizationSrv;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.LoaHistorySrv;
import com.ol.model.service.LoaLetterSrv;
import com.ol.model.service.ProjectSrv;
import com.ol.model.service.WorkSrv;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class ApproveLoaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(ApproveLoaAction.class);
	
	private int loaID;
	private LoaLetter loaLetter;
	private Employee loaOwner;
	private Project project;
	
	private List<LoaDetail> loaDetails;
	
	public LoaLetter getLoaLetter() {
		return loaLetter;
	}

	public void setLoaLetter(LoaLetter loaLetter) {
		this.loaLetter = loaLetter;
	}

	public Employee getLoaOwner() {
		return loaOwner;
	}

	public void setLoaOwner(Employee loaOwner) {
		this.loaOwner = loaOwner;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<LoaDetail> getLoaDetails() {
		return loaDetails;
	}

	public void setLoaDetails(List<LoaDetail> loaDetails) {
		this.loaDetails = loaDetails;
	}
	
	@Action(value = "approveLoa", results = {
			@Result(name = "success", location = "approve_loa", type = "tiles"),
			@Result(name = "error", location = "error", type = "tiles")
	})
	public String toApproveLoaAction()
	{
		if(Ulti.isInvalidRights(3))
		{
			return "login";
		}
		log4j.info("INFOOOO " + "approve " + this.getLoaID());
		
		try{
			Map<String, Object> session = ActionContext.getContext().getSession();
			String currentUserID = (String) session.get("loggedEmpID");
			
			LoaLetterSrv loaService = new LoaLetterSrv();
			EmployeeSrv empService = new EmployeeSrv();
			ProjectSrv prjService = new ProjectSrv();
			
			this.setLoaLetter(loaService.getLoaLetterByID(this.getLoaID()));
			this.setProject(prjService.getProjectInformation(this.getLoaLetter().getIPrjID()));
			this.setLoaOwner(empService.getEmployeeById(this.getLoaLetter().getSEmpID()));
			
			this.setLoaDetails(loaService.getLoaDetail(this.getLoaID()));
			
			if(!currentUserID.equals(this.getLoaLetter().getSNextManID()))
			{
				AuthorizationSrv authorSrv = new AuthorizationSrv();
				String authors = authorSrv.getAuthors(this.getLoaLetter().getSNextManID());
				
				Boolean isAuthorized;
				if(authors != null){
					isAuthorized = authors.contains(currentUserID);
				}else{
					isAuthorized = false;
				}
				if(!isAuthorized){
					addActionError("You have no right to approve this request.");
					return "error";
				}
			}
			
			this.getLoaLetter().setIStatus(2);
			loaService.updateLoaLetter(this.getLoaLetter());
		}catch (Exception e) {
			// TODO: handle exception
			addActionError(e.getMessage());
			return "error";
		}
		return "success";
	}
	
	public String getLoaStatus()
	{
		LoaAction loaAction = new LoaAction();
		String result = loaAction.ConvertStatus(this.getLoaLetter().getIStatus());
		return result;
	}
	
	public String convertLoaDetailType(int iType)
	{
		if(iType == 1) return "NoSalary";
		else return "HasSalary";
	}
	
	private String loaActionType;
	private String approveNote;
	public int getLoaID() {
		return loaID;
	}
	public void setLoaID(int loaID) {
		this.loaID = loaID;
	}
	public String getLoaActionType() {
		return loaActionType;
	}
	public void setLoaActionType(String loaActionType) {
		this.loaActionType = loaActionType;
	}
	public String getApproveNote() {
		return approveNote;
	}
	public void setApproveNote(String approveNote) {
		this.approveNote = approveNote;
	}
	
	@Action(value = "approveLoaAction", results = {
			@Result(name = "error", location = "error", type = "tiles"),
			@Result(name = "success", location = "viewLoa", type = "redirect", params = {
					"loaID", "${loaID}"
			})
	})
	public String approveLoaAction()
	{
		if(Ulti.isInvalidRights(3))
		{
			return "login";
		}
		String result = "error";
		
		if(this.getLoaActionType().equals("approve"))
		{
			result = approveLoa();
		}
		
		if(this.getLoaActionType().equals("deny"))
		{
			result = denyLoa();
		}
		
		return result;
	}

	private String approveLoa()
	{
		log4j.info("Approve " + this.getLoaID());
		String result = "";
		
		LoaLetterSrv loaService = new LoaLetterSrv();
		LoaHistorySrv historyService = new LoaHistorySrv();
		WorkSrv workSrv = new WorkSrv();
		
		LoaHistory history = new LoaHistory();
		history.setILoaID(this.getLoaID());
		history.setSManID((String) ActionContext.getContext().getSession().get("loggedEmpID"));
		
		LoaLetter loa = loaService.getLoaLetterByID(this.getLoaID());
		history.setIOldSatus(loa.getIStatus());
		
		if(loa.getIStatus() == 2 || loa.getIStatus() == 1)
		{
			Employee nextMan = workSrv.getNextManOfNextMan(loa);
			
			if(nextMan == null){
				loa.setIStatus(3);
				loa.setSNextManID(null);
			}else{
				loa.setIStatus(2);
				loa.setSNextManID(nextMan.getSID());
			}
			
			int updateResult = loaService.updateLoaLetter(loa);
			if(updateResult == 1)
			{
				result = "success";
			}
			else
			{
				result = "error";
			}
			
			if(nextMan != null)
			{
				String message = Ulti.createLoaNotificationMessage(loa);
				try {
					Ulti.sendHtmlEmail(nextMan.getSEmail(), "Yêu cầu duyệt", message);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					addActionError(e.getMessage());
					result = "error";
				}
			}
		}
		else
		{
			result = "success";
		}
		
		history.setIStatus(loa.getIStatus());
		history.setSNote(this.getApproveNote());
		historyService.insertLoaHistory(history);
		
		return result;
	}
	
	private String denyLoa()
	{
		log4j.info("Deny " + this.getLoaID());
		String result = "";
		
		LoaLetterSrv loaService = new LoaLetterSrv();
		LoaHistorySrv historyService = new LoaHistorySrv();
		
		LoaHistory history = new LoaHistory();
		history.setILoaID(this.getLoaID());
		history.setSManID((String) ActionContext.getContext().getSession().get("loggedEmpID"));
		
		LoaLetter loa = loaService.getLoaLetterByID(this.getLoaID());
		history.setIOldSatus(loa.getIStatus());
		
		if(loa.getIStatus() == 2 || loa.getIStatus() == 1)
		{
			loa.setIStatus(4);
			loa.setSNextManID(null);
			int updateResult = loaService.updateLoaLetter(loa);
			if(updateResult == 1)
			{
				result = "success";
			}
			else
			{
				result = "error";
			}
		}
		else
		{
			result = "success";
		}
		
		history.setIStatus(loa.getIStatus());
		history.setSNote(this.getApproveNote());
		historyService.insertLoaHistory(history);
		
		return result;
	}
}
