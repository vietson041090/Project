/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    : Ong Oai Viem
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/
package com.ol.model.service;

import java.util.Date;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.Authorization;
import com.ol.model.entity.AuthorizationHistory;
import com.ol.model.dao.AuthorizationDao;
import com.ol.model.dao.AuthorizationDaoImpl;


public class AuthorizationSrv {

	//Viem Get All Personal Letter
	public int Insert(Authorization Au){


		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();


			result = Aut.Insert(Au);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	public List<AuthorizationHistory> selectAllAuthorzationByID(String sEmpID)
	{
		List<AuthorizationHistory> result=null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();


			result = Aut.selectAllAuthorzationByID(sEmpID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int DisableAuthorization (String sEmpID,String sToEmpID,Date dToday)
	{

		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();


			result = Aut.DisableAuthorization(sEmpID, sToEmpID, dToday);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int getAuthorizationCountByEmpID(String sEmpID)
	{
		int result = -1;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();


			result = Aut.getAuthorizationCountByEmpID(sEmpID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	public String checkOverlap(String sEmpID)
	{
		String result=null;
		
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();
			 result = Aut.checkOverlap(sEmpID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	
	public String getAuthors(String sEmpID)
	{
		

		String result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			AuthorizationDao Aut= new AuthorizationDaoImpl ();
				
			result = Aut.checkOverlap(sEmpID);
			
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
}
