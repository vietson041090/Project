package com.ol.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import com.ol.helper.DateChecker;
import com.ol.helper.Ulti;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.ol.model.entity.ConfigData;
import com.ol.model.entity.Employee;
import com.ol.model.service.EmployeeSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@Namespace("/")
public class EditUserAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Employee employee;
	
	private String sID;
	
	private Map<Integer, String> groups;
	
	private String dStartday;
	
	private String DATE_FORMAT = "yyyy/MM/dd";
	
	
	@Action(value = "edituser", results = { 
			@Result(name = "success", type="tiles", location = "editUser"),
			@Result(name = "error", type="tiles", location = "error"), 
			@Result(name = "input", type="tiles", location = "editUser")})
	public String edituser(){
	
		if(Ulti.isInvalidRights(1)) return "login";
		
		if(this.getDStartday() == null || this.getDStartday().equals("")){
			addFieldError("dStartday", "Ngay vao lam khong duoc bo trong");
			return INPUT;
		}else{
			DateChecker checker = new DateChecker();
			System.out.println("TEST EMPLOYEE " + employee.getDStartday());
			if(!checker.check(this.getDStartday().toString()))
			{
				
				//employee.setDStartday(getDStartday());
				addFieldError("dStartday", "Ngay vao lam khong dung dinh dang.");
				return INPUT;
			}
		}
		//employee.setSFullname(sFullname)
		String result = INPUT;
		try {			
			
			System.out.println("vao try catch user " + employee.getSID());
			System.out.println("vao try catch user" + employee.getIType());
			System.out.println("vao try catch user" + employee.getSFullname());
			System.out.println("vao try catch user" + employee.getSEmail());
			System.out.println("vao try catch user" + employee.getDStartday());
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
			try {
				employee.setDStartday(format.parse(this.getDStartday()));
				System.out.print("HJKCBSJKBSKJBC "+ employee.getDStartday());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int status = 0;
			
			System.out.println("EQUALS");
			EmployeeSrv srv = new EmployeeSrv();
			status = srv.updateEmployee(employee);
			
			if(status == 1){
				result = SUCCESS;
				addActionMessage("Cap nhat du lieu thanh cong");
			}else{
				result = ERROR;
			}
			
		} catch (Exception ex) {
			
			result = ERROR;
		}
		//employee
		System.out.print(result);
		
		return result;
}
	
	
	@Action(value = "edituserform", results = { 
			@Result(name = "success", type="tiles", location = "editUserForm"),
			@Result(name = "error", type="tiles", location = "error"), 
			@Result(name = "input", type="tiles", location = "editUserForm")})
	public String edituserform(){
		
		if(Ulti.isInvalidRights(1)) return "login";
		
		//employee.setSFullname(sFullname)
		String result = INPUT;
		try {			
			
			System.out.println("vao try catch " + employee.getSID());
			System.out.println("vao try catch " + employee.getIType());
			System.out.println("vao try catch " + employee.getSFullname());
			System.out.println("vao try catch " + employee.getSEmail());
			System.out.println("vao try catch " + employee.getDStartday());
			
			
		} catch (Exception ex) {
			
			result = ERROR;
		}
		//employee
		System.out.print(result);
		
		return result;
	}


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Map<Integer, String> getGroups() {
		return groups;
	}


	public void setGroups(Map<Integer, String> groups) {
		this.groups = groups;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		String id = getRequest().getParameter("sID");
		System.out.println(id + "");
		System.out.print("prepare " + id);
		
		EmployeeSrv srv = new EmployeeSrv();
		employee = srv.getEmployeeById(id);
		setEmployee(srv.getEmployeeById(id));
		
		ConfigData configData = Ulti.parseXML();
		
		System.out.print(configData.getMax_loa_day() + "");
		
		groups = (HashMap<Integer, String>) configData.getGroup();
		
		if(employee == null){
			addActionError("Du lieu khong hop le - Khong ton tai thanh vien voi ma ID la : " + id);
		}else{
		
			String date = new SimpleDateFormat("yyyy/MM/dd").format(employee.getDStartday());
			System.out.println("DATE " + new SimpleDateFormat("yyyy/MM/dd").format(employee.getDStartday()));
			this.setDStartday(date);

		}
		
	}

	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		DateChecker checker = new DateChecker();
		if(this.getDStartday() != null && !this.getDStartday().equals("")){
			if(!checker.check(this.getDStartday()))
			{
				addFieldError("dStartday", "Ngay bat dau khong dung dinh dang.");
			}
		}
	}
	
	
	protected HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	

	public String getDStartday() {
		return dStartday;
	}

	public void setDStartday(String dStartday) {
		this.dStartday = dStartday;
	}


	public String getSID() {
		return sID;
	}


	public void setSID(String sID) {
		this.sID = sID;
	}
	

}
