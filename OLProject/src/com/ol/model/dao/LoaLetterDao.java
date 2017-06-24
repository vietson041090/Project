/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    : Ong Oai Viem
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/

package com.ol.model.dao;

import java.sql.Date;
import java.util.List;

import org.seasar.doma.*;
import org.seasar.doma.jdbc.SelectOptions;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.LoaDetail;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.PersonalLoaLetter;
import com.ol.model.entity.TimeLoa;
import com.ol.model.entity.DayLoa;

@Dao(config = DBConfig.class)
public interface LoaLetterDao {

	@Select
	public int SelectCountPersonalLetterByID(String sEmpID);

	@Select
	public List<PersonalLoaLetter> SelectPersonalLetterByIDPaging(
			String sEmpID, int PageNumber, int RowsPerPage, String sortColumn,
			String sortDir);

	// nam
	@Select
	public int getLastLoaIDByEmpID(String sEmpID, int iProj);

	// nam
	@Select
	public int getCountLoaByEmpID(String sEmpID, int iStatus);

	// nam
	@Select
	public float getMonthCountLoaByEmpID(String sEmpID, int iStatus);	

	// nam
	@Select
	public float getYearCountLoaByEmpID(String sEmpID, int iStatus);	
	
	// nam
	@Select
	public List<TimeLoa> getTimeLoaList(Date fdate, Date tdate, String empID, int prjID, int PageNumber, int RowsPerPage, String sortColumn, String sortDir);

	// nam
	@Select
	public int getTotalTimeLoaList(Date fdate, Date tdate, String empID, int prjID, int PageNumber, int RowsPerPage, String sortColumn, String sortDir);

	//nam
	@Select
	public List<DayLoa> getDayLoaList(Date fdate, Date tdate, String empID, int prjID, String sortColumn, String sortDir,SelectOptions selectOptions);

	//nam
	@Select
	public int getTotalDayLoaList(Date fdate, Date tdate, String empID, int prjID);

	//nam

	/*@Insert
	public Result<LoaLetter>  saveLoaLetter(LoaLetter loa);*/



	// nam
	@Select
	public List<LoaLetter> getWaitingLoa(String empID,String sortColumn, String sortDir,SelectOptions selectOptions);

	@Select
	public int getTotalWaitingLoa(String empID);

	//nam

	@Insert(sqlFile = true)
	public int saveLoaLetter(LoaLetter loa);

	@Delete(sqlFile=true)
	public int deleteLoa(String iLoaID, String iID);

	@Update
	public int updateLoaLetterTuan(LoaLetter loa);

	//nam
	@Update
	public int updateLoaLetterDetail(LoaDetail loa);


	//nam
	@Insert
	public int saveLoaLetterDetail(LoaDetail loa);

	//toan
	@Select
	public LoaLetter selectLoaLetter(int iLoaID);

	//toan
	@Select
	public List<LoaDetail> selectLoaDetail(int iLoaID);

	//toan
	@Select
	public List<LoaHistory> selectLoaHistory(int iLoaID);

	//toan
	@Update(sqlFile = true)
	public int updateLoaLetter(LoaLetter loa);

	//tuan
	@Insert(sqlFile=true)
	public int newLoaDetail(LoaDetail detail);
}
