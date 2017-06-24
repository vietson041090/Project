/*------------------------------------------------------------------------------ 
Create Date : 2014/05/14
Author    : Le Thien Toan
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/

package com.ol.model.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaHistoryInfo;

@Dao(config = DBConfig.class)
public interface LoaHistoryDao {

	@Insert(sqlFile = true)
	public int insertLoaHistory(LoaHistory loaHistory);
	
	//Sonnv
	@Select
	public List<LoaHistory> selectAll();
	
	//Sonnv
	@Select
	public List<LoaHistoryInfo> selectAllInfo(String sEmpID);
}
