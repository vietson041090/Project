package com.ol.model.dao;


import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.Project;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.ProjectMember;

/**
 * Author: 			LTToan
 * Created date: 	05/11/2014
 * Description: 	Project Dao Interface
 */

@Dao(config = DBConfig.class)
public interface ProjectDao {

	@Select
	public ProjectInformation getProjectInformation(int iID);
	
	@Select
	public List<ProjectInformation> getAllProjectInformation();
	
	@Select
	public List<ProjectInformation> getAllMyProjectInformation(String empID);
	
	@Select
	public List<ProjectMember> getProjectMember(int iID);
	
	@Select
	public List<ProjectMember> getNotProjectMember(int iID);
	
	@Update(sqlFile = true)
	public int updateProject(Project project);
	
	//Sonnv
	@Update(sqlFile=true)
	public int deleteProject(ArrayList<String> iID);
	
	//Sonnv
	@Insert(sqlFile=true)
	public int insertProjectWithSql(Project prj);


	@Select
	public List<ProjectInformation> getProjectByUserByUserID(String sEmpID);

	
	//Sonnv
	@Select
	public Integer getProjectID();
}

