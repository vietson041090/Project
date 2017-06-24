package com.ol.action;


import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.ol.model.service.EmployeeSrv;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@Namespace("/")
public class ChangePasswordAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static Logger log4j = LogManager.getLogger(ChangePasswordAction.class);
	private String currentPassword;
	private String newPassword;
	private String reNewPassword;
	
	
	
	Map<String, Object> session = ActionContext.getContext().getSession();
	private String sID = (String) session.get("loggedEmpID");
	/*
	Map<String, Object> session = ActionContext.getContext().getSession();
	sID = (String) session.get("loggedEmpID");*/


	
	
	@Action(value = "changePassword", results = { 
				@Result(name = "success", type="tiles", location = "changePassword"),
				@Result(name = "error", type="tiles", location = "error"), 
				@Result(name = "input", type="tiles", location = "changePassword")})
	public String executeChange(){
		
		String result = INPUT;
		try {
			
			System.out.println("vao try catch " + currentPassword);
			System.out.println("vao try catch " + newPassword);
			System.out.println("vao try catch " + reNewPassword);
			EmployeeSrv srv = new EmployeeSrv();
			int status = srv.updatePasswordById(sID, newPassword);
			System.out.println("RESULT " + status);
			if(status == 1){
				addActionMessage("Doi mat khau thanh cong");
				result = SUCCESS;
			}else {
				return ERROR;
			}

		} catch (Exception ex) {
			result = ERROR;
		}
		System.out.print(result);
		return result;
	}
	
	
	@Action(value = "changePasswordForm", results = { 
			@Result(name = "success", type="tiles", location = "changePassword"),
			@Result(name = "error", type="tiles", location = "error"), 
			@Result(name = "input", type="tiles", location = "changePassword")})
	public String executeForm(){
		
		return INPUT;
	}


	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("VAO VALIDATE");
		if(currentPassword == null || newPassword == null){
			setFieldErrors(null);
			//return INPUT;
		}
		System.out.println(sID + "");
		if(currentPassword != null && currentPassword.length() > 0){
			EmployeeSrv srv = new EmployeeSrv();
			int isExist = srv.checkPasswordExist(sID, currentPassword);
			if(isExist <= 0){
				addFieldError("currentPassword", "Mat khau khong chinh xac.");
			}
		}
	}
	
	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getReNewPassword() {
		return reNewPassword;
	}

	public void setReNewPassword(String reNewPassword) {
		this.reNewPassword = reNewPassword;
	}
	

	public String getsID() {
		return sID;
	}



	public void setsID(String sID) {
		this.sID = sID;
	}


	
}
