package com.ol.action;

/**
 * Author: 			
 * Created date: 	
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.ol.helper.Ulti;
import com.ol.model.entity.ConfigData;
import com.ol.model.entity.Employee;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.LoaLetterSrv;

@Namespace("/")
public class ProfileAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(ProfileAction.class);
	
	private Employee emp = new Employee();
	private String empID;
	
	private float restDayNo = 0;
	private float OkAllDayNo = 0;

	public float getOkAllDayNo() {
		return OkAllDayNo;
	}

	public void setOkAllDayNo(float okAllDayNo) {
		OkAllDayNo = okAllDayNo;
	}

	public float getRestDayNo() {
		return restDayNo;
	}

	public void setRestDayNo(float restDayNo) {
		this.restDayNo = restDayNo;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	//nam
	@Action(value = "view_profile", results = { @Result(name = "success", type="tiles", location = "view_profile") })
	public String execute1() {
		try {
			//if(Ulti.isInvalidRights(3)) return "login";
			
			System.out.print("---viewprofile 1--- "+empID); 
			if(empID==null || empID.isEmpty()){
				Map<String, Object> session = ActionContext.getContext().getSession();
				empID = session.get("loggedEmpID").toString();
			}
			System.out.print("---viewprofile 2--- "+empID); 
			
			EmployeeSrv srv = new EmployeeSrv();
			this.setEmp(srv.getProfile(empID));
			
			LoaLetterSrv loa = new LoaLetterSrv();
			this.getEmp().setIOkLoa(loa.getCountLoaByEmpID(empID, 3));
			
			this.getEmp().setIMonthLoa(loa.getMonthCountLoaByEmpID(empID, 3));
			
			//get all rest day of year
			ConfigData configData = new ConfigData();
			configData = Ulti.parseXML();
			OkAllDayNo = loa.getYearCountLoaByEmpID(empID, 3);
			restDayNo = configData.getMax_loa_day() - OkAllDayNo;

			
			//log4j.error(emp.getsEmail());
			System.out.print(emp.getIOkLoa()); 

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee newemp) {
		this.emp = newemp;
	}



}
