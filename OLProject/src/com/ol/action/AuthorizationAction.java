package com.ol.action;

/**
 * Author: 		Viêm	
 * Created date: 	12/05/2014
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.ol.helper.Ulti;
import com.ol.model.entity.Authorization;
import com.ol.model.entity.AuthorizationHistory;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.service.AuthorizationSrv;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.ProjectSrv;
import com.ol.model.service.WorkSrv;


@Namespace("/")
public class AuthorizationAction extends ActionSupport implements Preparable  {
	private String Mess=null;
	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(AuthorizationAction.class);
	private int projectID=-1;
	private int iPrjID=-1;
	private String sToEmpID;
	private List<AuthorizationHistory> Authorizations; 
	private Authorization Au=new Authorization();
	private List<ProjectInformation> Projects;
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public List<ProjectInformation> getProjects() {
		return Projects;
	}
	public void setProjects(List<ProjectInformation> projects) {
		Projects = projects;
	}
	public Authorization getAu() {
		return Au;
	}
	public void setAu(Authorization au) {
		Au = au;
	}
	private List<EmployeeCombobox> Employees;
	public List<EmployeeCombobox> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<EmployeeCombobox> employees) {
		Employees = employees;
	}
	@Override
	public void prepare() throws Exception {
		EmployeeSrv EmpSrv=new EmployeeSrv();
		setEmployees(EmpSrv.selectComboboxList());
		for(int i=0;i<=Employees.size()-1;i++)
		{
			Employees.get(i).setSDisplay( Employees.get(i).getSID()+"_"+Employees.get(i).getSFullName()  );

		}
		ProjectSrv PrjSrv=new ProjectSrv();
		Projects= PrjSrv.getProjectByUserByUserID(ServletActionContext.getRequest().getSession().getAttribute("loggedEmpID").toString());
		AuthorizationSrv AuSrv=new AuthorizationSrv();
		Authorizations=AuSrv.selectAllAuthorzationByID(ServletActionContext.getRequest().getSession().getAttribute("loggedEmpID").toString());

	}
	// Create by Ong Oai Viêm
	@Action(value = "ShowAuthorizationForm", results = { @Result(name = "success", type="tiles", location = "authorization")  })

	public String execute1() {
		try {
			if(Ulti.isInvalidRights(3))
				return "login";

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}
	@Action(value = "AddNewAuthorization", results = { @Result(name = "success", type="redirectAction", location = "ShowAuthorizationForm") ,
			@Result(name = "input",type="tiles", location = "authorization") })

	public String execute2() {

		try{
			if(Ulti.isInvalidRights(3))
				return "login";
			String UserID= ServletActionContext.getRequest().getSession().getAttribute("loggedEmpID").toString();
			AuthorizationSrv AuSrv=new AuthorizationSrv();
			Boolean checkMySelf= UserID.equals(Au.getSToEmpID());

			Boolean checksToEmpID=false;
			if(AuSrv.checkOverlap(UserID)!=null)
				checksToEmpID=AuSrv.checkOverlap(UserID).contains(Au.getSToEmpID());
			int AuthorCount=AuSrv.getAuthorizationCountByEmpID(UserID);
			if(Au.getSToEmpID()==null)
				Au.setSToEmpID(sToEmpID);
			if(AuthorCount <1 && (!checkMySelf && !checksToEmpID) )
			{
				Date d = new Date();
				Au.setDFromday(d);
				Au.setIStatus(1);
				Au.setSEmpID(UserID);

				if(projectID==-1)
					projectID=iPrjID;
				WorkSrv WorkSrv=new WorkSrv();
				Au.setIWorkID( WorkSrv.getWorkIDByEmpIdAndPrjID(projectID,UserID));
				AuSrv.Insert(Au);
				addActionMessage("Ủy quyền thành công cho " +Au.getSToEmpID()+" ,"+Au.getSToEmpID()+" đã có thể duyệt đơn xin phép giúp bạn");

			}
			else
			{
				if(checkMySelf || checksToEmpID)
					addActionError("Lỗi ủy quyền vòng, vui lòng xem lại chuỗi liên kết ủy quyền. Lỗi này xảy ra với tình trạng bạn tư ủy quyền cho chính bản thân mình hoặc trường hợp như sau VD: A->B->C->A");
				if(AuthorCount>=	1)
					addActionError("Chỉ có thể ủy quyền cho một người tại một thời điểm, vui lòng vô hiệu hóa những người còn lại");
				return "input";
			}
		}
		catch (Exception ex) {
			return "error";
		}


		return SUCCESS;
	}


	@Action(value = "DisableAuthorization",  results = { @Result(name = "success", type="redirect", location = "ShowAuthorizationForm") })

	public String execute3() {
		try {
			if(Ulti.isInvalidRights(3))
				return "login";
			Date d = new Date();
			AuthorizationSrv AuSrv=new AuthorizationSrv();
			String sEmpID=ServletActionContext.getRequest().getSession().getAttribute("loggedEmpID").toString();
			AuSrv.DisableAuthorization(sEmpID, sToEmpID, d);
		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}
	public List<AuthorizationHistory> getAuthorizations() {
		return Authorizations;
	}
	public void setAuthorizations(List<AuthorizationHistory>  authorizations) {
		Authorizations = authorizations;
	}
	public String getSToEmpID() {
		return sToEmpID;
	}
	public void setSToEmpID(String sToEmpID) {
		this.sToEmpID = sToEmpID;
	}
	public int getIPrjID() {
		return iPrjID;
	}
	public void setIPrjID(int iPrjID) {
		this.iPrjID = iPrjID;
	}
	public String getMess() {
		return Mess;
	}
	public void setMess(String mess) {
		Mess = mess;
	}






}
