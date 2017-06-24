package com.ol.model.service;
	
import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.ol.model.dao.ProjectDao;
import com.ol.model.dao.ProjectDaoImpl;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.Project;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.ProjectMember;

/**
 * Author: 			LTToan
 * Created date: 	05/12/2014
 * Description: 	Doma service for Project
 */

public class ProjectSrv {
	public ProjectInformation getProjectInformation(int iProjectID)
	{
		ProjectInformation result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.getProjectInformation(iProjectID);
					
			tx.commit();
		} finally {
			tx.rollback();

		}
		return result;
	}
	
	public List<ProjectInformation> getAllProjectInfomation()
	{
		List<ProjectInformation> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.getAllProjectInformation();
			
			tx.commit();
		} finally {
			tx.rollback();
		}
		
		return result;
	}
	
	public List<ProjectInformation> getAllMyProjectInfomation(String empID)
	{
		List<ProjectInformation> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.getAllMyProjectInformation(empID);
			
			tx.commit();
		} finally {
			tx.rollback();
		}
		
		return result;
	}


	public List<ProjectMember> getProjectMember(int iProjectID)
	{
		List<ProjectMember> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.getProjectMember(iProjectID);
			
			tx.commit();
		} finally{
			tx.rollback();
		}
		
		return result;
	}
	
	public List<ProjectMember> getNotProjectMember(int iProjectID)
	{
		List<ProjectMember> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.getNotProjectMember(iProjectID);
			
			tx.commit();
		} finally{
			tx.rollback();
		}
		
		return result;
	}
	
	public int updateProject(Project project)
	{
		int result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			ProjectDao prj = new ProjectDaoImpl();
			result = prj.updateProject(project);
			
			tx.commit();
		} finally{
			tx.rollback();
		}
		
		return result;
	}
	
	//Sonnv
	public int deleteProject(ArrayList<String> iID){
		int result = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			ProjectDao prjDao = new ProjectDaoImpl();
			prjDao.deleteProject(iID);
			transaction.commit();
			result = 1;
		}finally{
			transaction.rollback();
		}
		return result;
	}
	
	//Sonnv
	public int insertProjectWithSql(Project prj){
		int result = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			ProjectDao prjDao = new ProjectDaoImpl();
			prjDao.insertProjectWithSql(prj);
			transaction.commit();
			result = 1;
		}finally{
			transaction.rollback();
		}
		return result;
	}
	//Viem
	
	public List<ProjectInformation> getProjectByUserByUserID(String sEmpID)
	{
		List<ProjectInformation> result = null;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			ProjectDao prjDao = new ProjectDaoImpl();
			result= prjDao.getProjectByUserByUserID(sEmpID);
			transaction.commit();
		
		}finally{
			transaction.rollback();
		}
		return result;
	}
	
	//Sonnv 
	public Integer getProjectID(){
		Integer projectID ;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			ProjectDao prjDao = new ProjectDaoImpl();
			projectID = prjDao.getProjectID();
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return projectID;
	}
}

