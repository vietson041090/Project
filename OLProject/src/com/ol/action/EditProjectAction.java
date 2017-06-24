package com.ol.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.DateChecker;
import com.ol.helper.Ulti;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.Project;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.ProjectMember;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.ProjectSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

/**
 * Author: 			LTToan
 * Created date: 	05/12/2014
 * Description: 	Edit project information
 */

@Namespace("/")
public class EditProjectAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(EditProjectAction.class);
	private String DATE_FORMAT = "yyyy/MM/dd";
	
	private int projectID;
	private String projectName;
	private String pmID;
	private String projectStartDay;
	
	private ProjectInformation project;
	private List<ProjectMember> projectMember;



	public int getProjectID() {
		return projectID;
	}



	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getPmID() {
		return pmID;
	}



	public void setPmID(String pmID) {
		this.pmID = pmID;
	}



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



	public String getProjectStartDay() {
		return projectStartDay;
	}



	public void setProjectStartDay(String projectStartDay) {
		this.projectStartDay = projectStartDay;
	}



	@Action(value="editProjectAction", results = {
			@Result(name = "success", location = "ViewProjectInfo", type = "redirect", params = {
					"projectID", "${projectID}"
			}),
			@Result(name = "error", location = "error", type = "tiles"),
			@Result(name = "input", location = "edit_project", type = "tiles")
	})
	public String editProject()
	{
		if(Ulti.isInvalidRights(1))
		{
			return "login";
		}
		log4j.info("beginedit");
		Project project = new Project();
		project.setIID(this.getProjectID());
		project.setSFullname(this.getProjectName());
		project.setSPmID(this.getPmID());
		
		SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
		try {
			project.setDStartday(format.parse(this.getProjectStartDay()));
			log4j.info("HJKCBSJKBSKJBC "+ project.getDStartday());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ProjectSrv service = new ProjectSrv();
		int result = service.updateProject(project);
		log4j.info(result);
		if(result == 1){
			return "success";
		}
		else
		{
			return "error";
		}
	}
	
	public void validate()
	{
		log4j.info("begin validate.");
		log4j.info("Project "+this.getProjectID());
		log4j.info("Start day "+ this.getProjectStartDay());
		
		this.setProjectName(this.getProjectName().trim());
		if(this.getProjectName() == null || this.getProjectName().equals(""))
		{
			addFieldError("projectName", "Project's name can not be empty.");
		}
		
		if(this.getProjectStartDay() == null)
		{
			addFieldError("projectStartDay", "Project's start day can not be empty.");
		}
		else
		{
			DateChecker checker = new DateChecker();
			if(!checker.check(this.getProjectStartDay()))
			{
				addFieldError("projectStartDay", "Project's start day is invalid.");
			}
		}
		
		if(this.getPmID() == null)
		{
			addFieldError("pmID", "Project Manager can not be null.");
		}
		
		ProjectInformation pProject = ProjectIndexingAction.prepareProjectInformation(this.getProjectID());
		List<ProjectMember> pmProjectMember = ProjectIndexingAction.prepareProjectMember(this.getProjectID());
		
		log4j.info("INFOOOO " + pProject.getSFullname());
		log4j.info("INFOOOO " + pmProjectMember.size());
		
		pProject.setSFullname(this.getProjectName());
		pProject.setSPmID(this.getPmID());
		
		
		this.setProject(pProject);
		this.setProjectMember(pmProjectMember);
	}
}
