/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    : Ong Oai Viem
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/
package com.ol.model.service;

import java.sql.Date;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.DayLoa;
import com.ol.model.entity.LoaDetail;

import org.seasar.doma.jdbc.SelectOptions;

import com.ol.model.entity.Employee;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.PersonalLoaLetter;
import com.ol.model.entity.TimeLoa;
import com.ol.model.entity.Work;
import com.ol.model.dao.EmployeeDao;
import com.ol.model.dao.EmployeeDaoImpl;
import com.ol.model.dao.LoaLetterDao;
import com.ol.model.dao.LoaLetterDaoImpl;
import com.ol.model.dao.WorkDao;
import com.ol.model.dao.WorkDaoImpl;

import org.seasar.doma.jdbc.Result;

public class LoaLetterSrv {

	//Viem Get All Personal Letter
	public List<PersonalLoaLetter> personalLoaLetterListPaging( String sEmpID, int PageNumber,int RowsPerPage,String sortColumn,String sortDir ) {

		List<PersonalLoaLetter> result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.SelectPersonalLetterByIDPaging(sEmpID,PageNumber,RowsPerPage,sortColumn,sortDir);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	public int SelectCountPersonalLetterByID(String sEmpID){

		int result=-1;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.SelectCountPersonalLetterByID(sEmpID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public int getCountLoaByEmpID(String sEmpID, int iStatus){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getCountLoaByEmpID(sEmpID, iStatus);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public float getMonthCountLoaByEmpID(String sEmpID, int iStatus){
		float result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getMonthCountLoaByEmpID(sEmpID, iStatus);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public float getYearCountLoaByEmpID(String sEmpID, int iStatus){
		float result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getYearCountLoaByEmpID(sEmpID, iStatus);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public List<TimeLoa> getTimeLoaList(Date fdate, Date tdate, String empID, int prjID,int cpage, int spage, String sCol, String sDir){
		List<TimeLoa> result=null;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getTimeLoaList(fdate, tdate, empID, prjID,cpage,spage,sCol,sDir);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public int getTotalTimeLoaList(Date fdate, Date tdate, String empID, int prjID,int cpage, int spage, String sCol, String sDir){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getTotalTimeLoaList(fdate, tdate, empID, prjID,cpage,spage,sCol,sDir);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public List<DayLoa> getDayLoaList(Date fdate, Date tdate, String empID, int prjID,int PageNumber, int RowsPerPage,String sCol, String sDir){
		List<DayLoa> result=null;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			SelectOptions selectOptions = SelectOptions.get().offset(PageNumber-1).limit(RowsPerPage);

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getDayLoaList(fdate, tdate, empID, prjID,sCol,sDir,selectOptions);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public int getTotalDayLoaList(Date fdate, Date tdate, String empID, int prjID){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getTotalDayLoaList(fdate, tdate, empID, prjID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public List<LoaLetter> getWaitingLoa(String empID,int PageNumber, int RowsPerPage, String sortColumn, String sortDir){
		List<LoaLetter> result=null;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			SelectOptions selectOptions = SelectOptions.get().offset(PageNumber-1).limit(RowsPerPage);

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getWaitingLoa(empID,sortColumn,sortDir,selectOptions);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public int getTotalWaitingLoa(String empID){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.getTotalWaitingLoa(empID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public int saveLoa(LoaLetter loa, List<LoaDetail> more){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.saveLoaLetter(loa);

			if(result > 0){
				//get loa_id
				int loa_id = LolDao.getLastLoaIDByEmpID(loa.getSEmpID(),loa.getIPrjID());
				if(loa_id > 0){
					for(int i=0;i<more.size();i++){
						more.get(i).setILoaID(loa_id);
						result = LolDao.saveLoaLetterDetail(more.get(i));
						if(result < 1) {
							result = 0;
							break;
						}
					}
				}
			}

			if(result>0) tx.commit();
			else tx.rollback();

		} finally {
			tx.rollback();

		}
		return result;
	}
	
	
	

	//tuan
	public int updateLoa(LoaLetter loa, List<LoaDetail> more){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.updateLoaLetterTuan(loa);

			if(result > 0){
				//get loa_id
				//int loa_id = LolDao.getLastLoaIDByEmpID(loa.getSEmpID(),loa.getIPrjID());
				//if(loa_id > 0){
				for(int i=0;i<more.size();i++){
					//more.get(i).setILoaID(loa_id);
					result = LolDao.updateLoaLetterDetail(more.get(i));
					if(result < 1) {
						result = 0;
						break;
						//}
					}
				}
			}

			if(result>0) tx.commit();
			else tx.rollback();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//tuan
	public int deleteLoa(String iLoaID, String iID){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.deleteLoa(iLoaID, iID);

			tx.commit();


		}
		finally {
			tx.rollback();


		}
		return result;

	}	


	//tuan
	public int newLoaDetail(LoaDetail detail){
		int result=0;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();

			LoaLetterDao dao = new LoaLetterDaoImpl();

			result = dao.newLoaDetail(detail);

			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}		




	//toan
	public LoaLetter getLoaLetterByID(int iLoaID)
	{
		LoaLetter result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.selectLoaLetter(iLoaID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//toan
	public List<LoaDetail> getLoaDetail(int iLoaID)
	{
		List<LoaDetail> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.selectLoaDetail(iLoaID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//toan
	public List<LoaHistory> getLoaHistory(int iLoaID)
	{
		List<LoaHistory> result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.selectLoaHistory(iLoaID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//toan
	public int updateLoaLetter(LoaLetter loa)
	{
		int result;
		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			LoaLetterDao LolDao = new LoaLetterDaoImpl();
			result = LolDao.updateLoaLetter(loa);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
}
