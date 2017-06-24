package com.ol.action;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.DateChecker;
import com.ol.helper.Ulti;
import com.ol.model.entity.ConfigData;
import com.ol.model.entity.Employee;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.Work;
import com.ol.model.entity.WorkRole;
import com.ol.model.service.EmployeeSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;

@Namespace("/")
public class NewEmployeeAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee = new Employee();
	private Map<Integer, String> groups;
	private String sID;
	private String iType;
	private String sFullname;
	private String sEmail;
	
	public Map<Integer, String> getRoles() {
		return roles;
	}
	public void setRoles(Map<Integer, String> roles) {
		this.roles = roles;
	}

	private String dBirthday;
	private String dStartday;
	private String DATE_FORMAT = "yyyy/MM/dd";
	private int max_loa_day;
	private String randomPwd;
	private String backUpPwd;
	//private 
	
	private Map<Integer, String> roles = new HashMap<Integer, String>();
	
	
	private List<Work> works = new ArrayList<Work>();
	
	private List<ProjectInformation> pList;
	
	public List<ProjectInformation> getPList() {
		return pList;
	}
	public void setPList(List<ProjectInformation> pList) {
		this.pList = pList;
	}
	
	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	private Map<String, String> mapPM = new HashMap<String, String>();;
	
	private void prepareData(){
		
		List<WorkRole> workRoles = Ulti.GetWorkRoleByXML();
		System.out.println(workRoles.size() + "-");
		
		for(int i=0; i< workRoles.size(); i++){
			roles.put(workRoles.get(i).getIID(), workRoles.get(i).getSRoleTitle());
			System.out.print(workRoles.get(i).getIID() + "-" + workRoles.get(i).getSRoleTitle());
		}
		
		pList = Ulti.getProjectSelectList();
		
		for(int i=0; i< pList.size(); i++){
			map.put(pList.get(i).getIID(), pList.get(i).getSFullname());
			System.out.println(pList.get(i).getIID() + "-" + pList.get(i).getSFullname() + "-");
		}
		
		for(int i=0; i< pList.size(); i++){
			mapPM.put(pList.get(i).getSPmID(), pList.get(i).getSPMName());
			System.out.println(pList.get(i).getSPmID() + "-" + pList.get(i).getSPMName());
		}
		
		System.out.print(pList.size() + "");
		
		randomPwd = Ulti.randomPassword();
		
		System.out.print(randomPwd);
			
		ConfigData configData = Ulti.parseXML();
		
		groups = (HashMap<Integer, String>) configData.getGroup();
		
		employee.setIMaxlday(configData.getMax_loa_day());
		
		max_loa_day = configData.getMax_loa_day();
	}
	
	
	
	@Action(value = "newemployeeform", results = { 
			@Result(name = "success", type="tiles", location = "new_user"),
			@Result(name = "error", type="tiles", location = "error"), 
			@Result(name = "input", type="tiles", location = "new_user")})
	public String newemployeeform(){
		// TODO Auto-generated method stub
		if(Ulti.isInvalidRights(1)) return "login";
		
		return SUCCESS;
	}
	
	
	@Action(value = "newemployee", results = { 
				@Result(name = "success", type="tiles", location = "new_user"),
				@Result(name = "error", type="tiles", location = "error"), 
				@Result(name = "input", type="tiles", location = "new_user")})
	public String newemployee(){
		// TODO Auto-generated method stub
		
		if(Ulti.isInvalidRights(1)) return "login";
		
		if(works != null || works.size() <= 0){
			System.out.println("SIZE NULL");
		}
		System.out.println("WORD" + works.size());
		for(int i=0; i< works.size(); i++){
			for(int j = i+1; j< works.size(); j++){
				if(works.get(i).getIPrjID() == works.get(j).getIPrjID()){
					System.out.println(works.get(i).getIPrjID());
					addActionError("Du an khong duoc trung");
					break;
				}
			}
			System.out.println(works.get(i).getIPrjID() + "-" + works.get(i).getSManID());
		}
		System.out.println("PM" + mapPM.toString());
		
		if(sID != null && sID.length() > 0){
			System.out.println("VALIDATE SID");
			EmployeeSrv srv = new EmployeeSrv();
			int isExist = srv.checkIDExist(sID);
			if(isExist == 1){
				addFieldError("sID", " Ma nhan vien da ton tai");
			}
		}
		
		if(dBirthday != null && dBirthday.length() > 0){
			System.out.println("VALIDATE dbirthday " + dBirthday);
			DateChecker checker = new DateChecker();
			if(!checker.check(this.getDBirthday()))
			{
				addFieldError("dBirthday", "Ngay sinh khong dung dinh dang.");
			}
		}
		if(dStartday != null && dStartday.length() > 0){
			
			System.out.println("VALIDATE dStartday " + dStartday);
			DateChecker checker = new DateChecker();
			if(!checker.check(this.getDStartday()))
			{
				addFieldError("dStartday", "Ngay bat dau khong dung dinh dang.");
			}
		}
		
		if(!hasErrors()){
			
			System.out.println("NO ERROR 1");
			String result = INPUT;
			String subject = "Your account activation";
			try {		
				
				backUpPwd = randomPwd;
				
				System.out.println("NO ERROR 2 " + works.size());
				
				Employee employee = new Employee();
				employee.setSID(getSID());
				employee.setSPassword(randomPwd);
				employee.setSFullname(getSFullname());
				
				SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
				try {
					employee.setDStartday(format.parse(this.getDStartday()));
					employee.setDBirthday(format.parse(this.getDBirthday()));
					System.out.println("HJKCBSJKBSKJBC "+ employee.getDStartday());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				employee.setSEmail(getSEmail());
				employee.setIType(Integer.parseInt(getIType()));
				employee.setIStatus(1);
				employee.setIMaxlday(max_loa_day);
				
				int status = 0;

				EmployeeSrv srv = new EmployeeSrv();
				
				status = srv.saveEmployee(employee, works);
				
				if(status == 1){
					result = SUCCESS;
					
					addActionMessage("Cap nhat du lieu thanh cong.");
					try {
				
						System.out.println("VAO TRY SEND MAIL");
						Ulti.sendHtmlEmail(sEmail, subject, Ulti.createEmailMessage(sID, backUpPwd));
					} catch (Exception  e) {
						// TODO Auto-generated catch block
						System.out.println("VAO CATCH SEND MAIL");
					}
				}else{
					addActionMessage("Cap nhat du lieu that bai.");
					result = ERROR;
				}
				
			} catch (Exception ex) {
				
				result = ERROR;
			}
			//employee
			System.out.print(result);
			return result;
			
		}
		
		return SUCCESS;
	}
	
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("VALIDATE");
		
		if(sEmail != null && sEmail.length() <= 0){
			addActionError("Email khong duoc bo trong.");
		}
		
		if(sFullname != null && sFullname.length() <= 0){
			addActionError("Ten nhan vien khong duoc bo trong.");
		}
		
		if(dBirthday != null && dBirthday.length() <= 0){
			addActionError("Ngay sinh khong duoc bo trong.");
		}
		
		if(dStartday != null && dStartday.length() <= 0){
			addActionError("Ngay bat dau khong duoc bo trong.");
		}
		
		if(sID != null && sID.length() > 0){
			System.out.println("VALIDATE SID");
			EmployeeSrv srv = new EmployeeSrv();
			int isExist = srv.checkIDExist(sID);
			if(isExist == 1){
				addActionError("Ma nhan vien da ton tai.");
			}
		}
		
		if(dBirthday != null && dBirthday.length() > 0){
			System.out.println("VALIDATE dbirthday " + dBirthday);
			DateChecker checker = new DateChecker();
			if(!checker.check(this.getDBirthday()))
			{
				addActionError("Ngay sinh khong dung dinh dang.");
			}
		}
		if(dStartday != null && dStartday.length() > 0){
			
			System.out.println("VALIDATE dStartday " + dStartday);
			DateChecker checker = new DateChecker();
			if(!checker.check(this.getDStartday()))
			{
				addActionError("Ngay bat dau khong dung dinh dang.");
			}
		}
		
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
		prepareData();
	}

	public String getSID() {
		return sID;
	}

	public void setSID(String sID) {
		this.sID = sID;
	}


	public String getSFullname() {
		return sFullname;
	}


	public void setSFullname(String sFullname) {
		this.sFullname = sFullname;
	}


	public String getIType() {
		return iType;
	}


	public void setIType(String iType) {
		this.iType = iType;
	}


	@EmailValidator(message="Email khong dung dinh dang")
	public String getSEmail() {
		return sEmail;
	}


	public void setSEmail(String sEmail) {
		this.sEmail = sEmail;
	}


	public String getDStartday() {
		return dStartday;
	}


	public void setDStartday(String dStartday) {
		this.dStartday = dStartday;
	}


	public String getDBirthday() {
		return dBirthday;
	}


	public Map<String, String> getMapPM() {
		return mapPM;
	}
	public void setMapPM(Map<String, String> mapPM) {
		this.mapPM = mapPM;
	}
	public void setDBirthday(String dBirthday) {
		this.dBirthday = dBirthday;
	}


	public String getRandomPwd() {
		return randomPwd;
	}


	public void setRandomPwd(String randomPwd) {
		this.randomPwd = randomPwd;
	}
	public List<Work> getWorks() {
		return works;
	}
	public void setWorks(List<Work> works) {
		this.works = works;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	

	

}
