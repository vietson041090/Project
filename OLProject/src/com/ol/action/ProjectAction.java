package com.ol.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.DateChecker;
import com.ol.helper.Ulti;
import com.ol.model.entity.Employee;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.Project;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.Work;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.ProjectSrv;
import com.ol.model.service.WorkSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@Namespace("/")
public class ProjectAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String DATE_FORMAT = "yyyy/MM/dd";
	//Sonnv
	@Action(value = "view_Prj", results = { @Result(name = "view", type="tiles", location = "view_listPrj") })
	public String view(){
		if(Ulti.isInvalidRights(1)) return "login";
		return "view";
	}
	
	private Project prj = new Project();
	private String dStartday;
	
	public String getDStartday() {
		return dStartday;
	}
	public void setDStartday(String dStartday) {
		this.dStartday = dStartday;
	}
	public Project getPrj() {
		return prj;
	}
	public void setPrj(Project prj) {
		this.prj = prj;
	}
	
	private List<ProjectInformation> lsPrjInfo;
	
	public List<ProjectInformation> getLsPrjInfo() {
		return lsPrjInfo;
	}

	public void setLsPrjInfo(List<ProjectInformation> lsPrjInfo) {
		this.lsPrjInfo = lsPrjInfo;
	}
	
	private ArrayList<String> empCheck;

	public ArrayList<String> getEmpCheck() {
		return empCheck;
	}

	public void setEmpCheck(ArrayList<String> empCheck) {
		this.empCheck = empCheck;
	}

	@Action(value="delete_Prj", 
			results = {@Result(name="success", type ="tiles", location="view_listPrj"),
						@Result(name="error", type ="tiles", location="error")})
	public String executeDel() {
		if(Ulti.isInvalidRights(1)) return "login";
		for(String s: empCheck){
			System.out.print(s);
		}
		
		ProjectSrv prjSrv = new ProjectSrv();
		int result = prjSrv.deleteProject(empCheck);
		if(result==1){
			getListPrj();
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	private String btThem;
	
	public String getBtThem() {
		return btThem;
	}
	public void setBtThem(String btThem) {
		this.btThem = btThem;
	}
	@Action(value="insert_Prj", results={@Result(name="success", type="tiles",location="view_listPrj"),
										@Result(name="error", type="tiles",location="view_listPrj")})
	public String executeInsert(){
		if(Ulti.isInvalidRights(1)) return "login";
		System.out.println("---------------"+btThem);
		if ("Thêm".equals(btThem)) {
			if (prj.getSFullname().trim().equals("")|| prj.getSFullname()==null)
				addActionError("Project name is required");
			if (this.getDStartday() == null){
				addActionError("Start day is required");
			}else{
				System.out.println(this.getDStartday());
				DateChecker checker = new DateChecker();
				if(!checker.check(this.getDStartday()))
				{
					addActionError("Start day is invalid.");
				}
			
			}
			if(prj.getSPmID()==null || prj.getSPmID().trim().equals(""))
				addActionError("Project manager is required.");
			if (getActionErrors().isEmpty())
			{
			SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
			try {
				prj.setDStartday(format.parse(this.getDStartday()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ProjectSrv prjSrv = new ProjectSrv();
			int result = prjSrv.insertProjectWithSql(prj);
			if(result == 1){
				insertWork();
				getListPrj();
				addActionMessage("The project is added successfully.");
				return SUCCESS;
				
			}else{
				addActionError("Add project failed.");
				return ERROR;
			}
			}
		}
		return SUCCESS;
	}
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		getComboboxEmpList();
		getListPrj();
	}
	
	public void getListPrj(){
		ProjectSrv prjSrv = new ProjectSrv();
		List<ProjectInformation> lsPrj = prjSrv.getAllProjectInfomation();
		this.setLsPrjInfo(lsPrj);
	}
	private List<EmployeeCombobox> Emps;
	public List<EmployeeCombobox> getEmps() {
		return Emps;
	}
	public void setEmps(List<EmployeeCombobox> emps) {
		Emps = emps;
	}
	
	public void getComboboxEmpList(){
		EmployeeSrv EmpSrv=new EmployeeSrv();
		setEmps(EmpSrv.selectComboboxList());
		for(int i=0;i<=Emps.size()-1;i++)
		{
			Emps.get(i).setSDisplay( Emps.get(i).getSID()+"_"+Emps.get(i).getSFullName() );
		}
	}
	
	private Work work = new Work(); 
	public Work getWork() {
		return work;
	}
	public void setWork(Work work) {
		this.work = work;
	}
	public void insertWork(){
		work.setSEmpID(this.prj.getSPmID());
		ProjectSrv prjSrv = new ProjectSrv();
		Integer prjID = prjSrv.getProjectID();
		System.out.println("AAAAA"+prjID);
		work.setIPrjID(prjID);
		work.setIRolID(3);
		work.setSManID(null);
		work.setIStatus(1);
		WorkSrv workSrv = new WorkSrv();
		workSrv.insertWork(work);
	}
}
