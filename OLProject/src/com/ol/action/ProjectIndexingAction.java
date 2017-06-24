package com.ol.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.Ulti;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.ProjectMember;
import com.ol.model.entity.Work;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.ProjectSrv;
import com.ol.model.service.WorkSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.ol.model.entity.WorkRole;
@Namespace("/")
public class ProjectIndexingAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(ProjectIndexingAction.class);
	private List<EmployeeCombobox> Employees;
	private Work newWork=new Work();
	public Work getNewWork() {
		return newWork;
	}
	public void setNewWork(Work newWork) {
		this.newWork = newWork;
	}
	public List<EmployeeCombobox> getEmployees() {
		return Employees;
	}
	public void setEmployees(List<EmployeeCombobox> employees) {
		Employees = employees;
	}
	private int projectID;
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}


	private int workEditRoleID=0;

	public List<WorkRole> getWorkRole() {
		return WorkRole;
	}

	public void setWorkRole(List<WorkRole> workRole) {
		WorkRole = workRole;
	}


	private List<WorkRole> WorkRole;
	private List<String> workCheck =new ArrayList<String>();


	public List<String> getWorkCheck() {
		return workCheck;
	}

	public void setWorkCheck(List<String> workCheck) {
		this.workCheck = workCheck;
	}

	public static List<ProjectInformation> prepareAllProjectInformation()
	{
		List<ProjectInformation> piList;
		ProjectSrv service = new ProjectSrv();
		piList = service.getAllProjectInfomation();

		return piList;
	}

	public static ProjectInformation prepareProjectInformation(int iProjectID)
	{
		ProjectInformation pi;
		ProjectSrv service = new ProjectSrv();
		pi = service.getProjectInformation(iProjectID);

		return pi;
	}

	public static List<ProjectMember> prepareProjectMember(int iProjectID)
	{
		List<ProjectMember> pmList;
		ProjectSrv service = new ProjectSrv();
		pmList = service.getProjectMember(iProjectID);

		return pmList;
	}



	public static List<ProjectMember> prepareNotProjectMember(int iProjectID)
	{
		List<ProjectMember> pmList;
		ProjectSrv service = new ProjectSrv();
		pmList = service.getNotProjectMember(iProjectID);

		return pmList;
	}


	private ProjectInformation project;
	private List<ProjectMember> projectMember;

	public ProjectInformation getProject() {
		return project;
	}

	public void setProject(ProjectInformation project) {
		this.project = project;
	}

	public List<ProjectMember> getProjectMember() {
		return projectMember;
	}

	public void setProjectMember(List<ProjectMember> projectMember) {
		this.projectMember = projectMember;
	}


	public int getWorkEditRoleID() {
		return workEditRoleID;
	}

	public void setWorkEditRoleID(int workEditRoleID) {
		this.workEditRoleID = workEditRoleID;
	}
	@Action(value = "toEditProject", results = {
			@Result(name = "success", location = "edit_project", type = "tiles")
	})
	public String toEditProjectPage()
	{

		this.setProject(prepareProjectInformation(this.getProjectID()));
		this.setProjectMember(prepareProjectMember(this.getProjectID()));

		log4j.info("INFOOOO " + this.getProject().getSFullname());
		log4j.info("INFOOOO " + this.getProjectMember().size());
		return "success";
	}
	@Action(value = "DeleteWork", results = {
			@Result(name = "success",  location = "ViewProjectInfo", type = "redirect", params = { "ProjectID", "${projectID}"} )})

	public String DeleteWorkabc()
	{

		WorkRole=Ulti.GetWorkRoleByXML();
		this.setProject(prepareProjectInformation(projectID));
		this.setProjectMember(prepareProjectMember(projectID));
		WorkSrv Wsrv=new WorkSrv();

		for(int i=0;i<=workCheck.size()-1;i++)
		{
			Wsrv.deleteWorkByID(Integer.parseInt(workCheck.get(i)));}

		return "success";
	}
	@Action(value = "EditWork", results = {
			@Result(name = "success",  location = "ViewProjectInfo", type = "redirect", params = { "ProjectID", "${projectID}"} )})
	public String EditWork()
	{
		WorkSrv Wsrv=new WorkSrv();
		Wsrv.updateWork(newWork);
		return "success";
	}
	@Action(value = "AddNewWork", results = {
			@Result(name = "success", location = "ViewProjectInfo", type = "redirect", params = { "ProjectID", "${projectID}"} )
			,@Result(name = "input", location = "ViewProjectInfo", type = "redirect", params = { "ProjectID", "${projectID}"})		
	})
	public String AddNewWork()
	{
		Boolean isCanInsert=true;
		this.setProject(prepareProjectInformation(projectID));
		this.setProjectMember(prepareProjectMember(projectID));
		for(int i=0;i<=projectMember.size()-1;i++)
		{
			if(projectMember.get(i).getSEmployeeId().equals(newWork.getSEmpID()))
			{
				isCanInsert=false;
				break;
			}
		}
		if(isCanInsert==false)
		{
			addActionError("Người ngày đã có trong dự án");
			return "input";
		}
		newWork.setIPrjID(projectID);
		newWork.setIStatus(1);
		WorkSrv WSrv=new WorkSrv();

		WSrv.insertWork(newWork);
		return "success";
	}
	@Action(value = "ViewProjectInfo", results = {
			@Result(name = "success", location = "viewProjectInfo", type = "tiles")
	})
	public String ViewProjectInfo()
	{
		this.setProject(prepareProjectInformation(projectID));
		this.setProjectMember(prepareProjectMember(projectID));
		EmployeeSrv EmpSrv=new EmployeeSrv();
		setEmployees(EmpSrv.selectComboboxList());
		for(int i=0;i<=Employees.size()-1;i++)
		{
			Employees.get(i).setSDisplay( Employees.get(i).getSID()+"_"+Employees.get(i).getSFullName());

		}
		for(int i=0;i<=projectMember.size()-1;i++)
		{
			projectMember.get(i).setSDisplay( projectMember.get(i).getSEmployeeId()+"_"+projectMember.get(i).getSEmployeeName());
		}
		WorkRole=Ulti.GetWorkRoleByXML();



		return "success";
	}
	public String GetRoleByID(int ID)
	{

		String Result=null;
		for(int i=0;i<= WorkRole.size();i++  )
		{
			if(WorkRole.get(i).getIID()==ID)
			{	
				Result=WorkRole.get(i).getSRoleTitle();
				break;
			}
		}
		return Result;
	}





}
