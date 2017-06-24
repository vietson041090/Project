/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    : Ong Oai Viem
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/
package com.ol.model.service;

import org.seasar.doma.jdbc.tx.LocalTransaction;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.Authorization;
import com.ol.model.entity.Work;
import com.ol.model.entity.Employee;
import com.ol.model.entity.LoaLetter;
import com.ol.model.dao.AuthorizationDao;
import com.ol.model.dao.AuthorizationDaoImpl;
import com.ol.model.dao.WorkDao;
import com.ol.model.dao.WorkDaoImpl;


public class WorkSrv {

	//Viem Get All Personal Letter
	public int getWorkIDByEmpIdAndPrjID(int iPrjID, String sEmpID ){


		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			WorkDao Work= new WorkDaoImpl ();
				
			
			result = Work.getWorkIDByEmpIdAndPrjID(iPrjID, sEmpID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int deleteWorkByID(int iID){


		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			WorkDao Work= new WorkDaoImpl ();
				
			
			result = Work.deleteWorkByID(iID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int insertWork(Work work)
	{
		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			WorkDao Work= new WorkDaoImpl ();
				
			
			result = Work.insertWork(work);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int updateWork(Work work)
	{
		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			WorkDao Work= new WorkDaoImpl ();
				
			
			result = Work.updateWork(work);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	//toan
	public Employee getNextManOfNextMan(LoaLetter loa)
	{
		Employee result;
		
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try{
			tx.begin();
			WorkDao workDao = new WorkDaoImpl();
			
			result = workDao.getNextManOfNextMan(loa);
			tx.commit();
		}
		finally{
			tx.rollback();
		}
		
		return result;
	}


}
