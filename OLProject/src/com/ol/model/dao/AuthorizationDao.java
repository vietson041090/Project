package com.ol.model.dao;

import java.util.Date;
import java.util.List;

import org.seasar.doma.*;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.Authorization;
import com.ol.model.entity.AuthorizationHistory;

@Dao(config = DBConfig.class)
public interface AuthorizationDao {

	//Created by Viem
	@Insert(sqlFile=true)
	public int Insert(Authorization Au);
	@Select 
	List<AuthorizationHistory> selectAllAuthorzationByID(String sEmpID);
	@Update(sqlFile=true)
	int DisableAuthorization (String sEmpID,String sToEmpID,Date dToday);
	@Select
	int getAuthorizationCountByEmpID(String sEmpID);
	@Select
	String checkOverlap(String sEmpID);
	
}
