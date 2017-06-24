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
import com.ol.model.entity.LetterStatus;
import com.ol.model.entity.LoaDetail;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.Project;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.LoaHistorySrv;
import com.ol.model.service.LoaLetterSrv;
import com.ol.model.service.ProjectSrv;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class ViewLoaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(EditProjectAction.class);
	
	private int loaID;
	
	private LoaLetter loaLetter;
	private Employee loaOwner;
	private Project project;
	
	private List<LoaDetail> loaDetails;
	private List<LoaHistory> loaHistory;
	
	private Boolean isOwner;

	public int getLoaID() {
		return loaID;
	}

	public void setLoaID(int loaID) {
		this.loaID = loaID;
	}

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

	public List<LoaHistory> getLoaHistory() {
		return loaHistory;
	}

	public void setLoaHistory(List<LoaHistory> loaHistory) {
		this.loaHistory = loaHistory;
	}

	public Boolean getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}
	
	@Action(value = "viewLoa", results = {
			@Result(name = "success", location = "view_loa", type = "tiles"),
			@Result(name = "error", location = "error", type = "tiles")
	})
	public String viewLoaAction()
	{
		if(!Ulti.isInvalidRights(1))
		{
			return "login";
		}
		log4j.info("INFOOOO " + "viewLoa " + this.getLoaID());
		
		try
		{
			Map<String, Object> session = ActionContext.getContext().getSession();
			String currentUserID = (String) session.get("loggedEmpID");
			
			LoaLetterSrv loaService = new LoaLetterSrv();
			EmployeeSrv empService = new EmployeeSrv();
			ProjectSrv prjService = new ProjectSrv();
			
			this.setLoaLetter(loaService.getLoaLetterByID(this.getLoaID()));
			this.setProject(prjService.getProjectInformation(this.getLoaLetter().getIPrjID()));
			this.setLoaOwner(empService.getEmployeeById(this.getLoaLetter().getSEmpID()));
			
			this.setLoaDetails(loaService.getLoaDetail(this.getLoaID()));
			this.setLoaHistory(loaService.getLoaHistory(this.getLoaID()));
			
			if(currentUserID == null || !currentUserID.equals(this.getLoaLetter().getSEmpID()))
			{
				isOwner = false;
			}
			else
			{
				isOwner = true;
			}
		}
		catch (Exception e) {
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
	
	public String convertLetterAction(int iStatus)
	{
		List<LetterStatus> LetterStatus=Ulti.GetLetterActionByXML();
		String Result=null;
		for(int i=0;i<= LetterStatus.size();i++  )
		{
			if(LetterStatus.get(i).getIID()==iStatus)
			{	
				Result=LetterStatus.get(i).getSStatus();
				break;
			}
		}
		return Result;
	}
	
	public String convertLoaDetailType(int iType)
	{
		if(iType == 1) return "NoSalary";
		else return "HasSalary";
	}
	
	private String loaActionType;

	public String getLoaActionType() {
		return loaActionType;
	}

	public void setLoaActionType(String loaActionType) {
		this.loaActionType = loaActionType;
	}

	@Action(value = "loaFormAction", results = {
			@Result(name = "error", location = "error", type = "tiles"),
			@Result(name = "send", location = "viewLoa", type = "redirect", params = {
					"loaID", "${loaID}"
			}),
			@Result(name = "cancel", location = "viewLoa", type = "redirect", params = {
					"loaID", "${loaID}"
			}),
			@Result(name = "edit", location = "edit_loa_form", type = "redirect", params = {
					"loaID", "${loaID}"
			}),
			@Result(name = "remove", location = "ViewPersonalLoaLetter", type = "redirect")
	})
	public String loaFormAction()
	{
		if(Ulti.isInvalidRights(3))
		{
			return "login";
		}
		String result = "error";
		
		String actionType = this.getLoaActionType();
		
		if(actionType.equals("send"))
		{
			result = sendLoaAction();
		}
		
		if(actionType.equals("cancel"))
		{
			result = cancelLoaAction();
		}
		
		if(actionType.equals("edit"))
		{
			result = editLoaAction();
		}
		
		if(actionType.equals("remove"))
		{
			result = removeLoaAction();
		}
		
		return result;
	}
	
	private String sendLoaAction()
	{
		log4j.info("INFOOOO " + "send " + this.getLoaID());
		String sResult;
		LoaLetterSrv service = new LoaLetterSrv();
		LoaHistorySrv historyService = new LoaHistorySrv();
		
		LoaHistory history = new LoaHistory();
		history.setILoaID(this.getLoaID());
		history.setSManID((String) ActionContext.getContext().getSession().get("loggedEmpID"));
		
		LoaLetter loa = service.getLoaLetterByID(this.getLoaID());
		history.setIOldSatus(loa.getIStatus());
		
		if(loa.getIStatus() == 0)
		{
			loa.setIStatus(1);
			int result = service.updateLoaLetter(loa);
			
			if(result == 1){
				sResult = "send";
				if(loa.getSNextManID() != null)
				{
					String message = Ulti.createLoaNotificationMessage(loa);
					EmployeeSrv empSrv = new EmployeeSrv();
					Employee nextMan = empSrv.getEmployeeById(loa.getSNextManID());
					try {
						Ulti.sendHtmlEmail(nextMan.getSEmail(), "Yêu cầu duyệt", message);
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						addActionError(e.getMessage());
						sResult = "error";
					}
				}
			}
			else
			{
				sResult = "error";
			}
		}
		else
		{
			sResult = "send";
		}
		
		history.setIStatus(loa.getIStatus());
		history.setSNote(sResult);
		historyService.insertLoaHistory(history);
		
		return sResult;
	}
	
	
	private String cancelReason;
	
	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	private String cancelLoaAction()
	{
		log4j.info("INFOOOO " + "cancel " + this.getLoaID());
		log4j.info("INFOOOO " + "cancel " + this.getCancelReason());
		String sResult;
		LoaLetterSrv service = new LoaLetterSrv();
		LoaHistorySrv historyService = new LoaHistorySrv();
		
		LoaHistory history = new LoaHistory();
		history.setILoaID(this.getLoaID());
		history.setSManID((String) ActionContext.getContext().getSession().get("loggedEmpID"));
		
		LoaLetter loa = service.getLoaLetterByID(this.getLoaID());
		history.setIOldSatus(loa.getIStatus());
		if(loa.getIStatus() < 4 && loa.getIStatus() > 1)
		{
			loa.setIStatus(5);
			
			int result = service.updateLoaLetter(loa);
			if(result == 1)
			{
				//TODO
				//send mail to who might concern
				
				sResult = "cancel";
			}
			else
			{
				sResult = "error";
			}
		}
		else
		{
			sResult = "cancel";
		}
		
		history.setIStatus(loa.getIStatus());
		history.setSNote(sResult);
		historyService.insertLoaHistory(history);
		
		return sResult;
	}
	
	private String editLoaAction()
	{
		log4j.info("INFOOOO " + "edit " + this.getLoaID());
		LoaLetterSrv service = new LoaLetterSrv();
		LoaLetter loa = service.getLoaLetterByID(this.getLoaID());
		if(loa.getIStatus() < 2 && loa.getIStatus() > -1)
		{
			return "edit";
		}
		else
		{
			return "cancel";
		}
	}
	
	private String removeLoaAction()
	{
		log4j.info("INFOOOO " + "remove " + this.getLoaID());
		String sResult;
		LoaLetterSrv service = new LoaLetterSrv();
		LoaHistorySrv historyService = new LoaHistorySrv();
		
		LoaHistory history = new LoaHistory();
		history.setILoaID(this.getLoaID());
		history.setSManID((String) ActionContext.getContext().getSession().get("loggedEmpID"));
		
		LoaLetter loa = service.getLoaLetterByID(this.getLoaID());
		history.setIOldSatus(loa.getIStatus());
		if(loa.getIStatus() < 2 && loa.getIStatus() > -1)
		{
			loa.setIStatus(-1);
			int result = service.updateLoaLetter(loa);
			if(result == 1){
				sResult = "remove";
			}
			else
			{
				sResult = "error";
			}
		}
		else
		{
			sResult = "remove";
		}
		
		history.setIStatus(loa.getIStatus());
		history.setSNote(sResult);
		historyService.insertLoaHistory(history);
		
		return sResult;
	}
}
