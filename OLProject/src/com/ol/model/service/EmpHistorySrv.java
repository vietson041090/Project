package com.ol.model.service;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.ol.model.dao.EmpHistoryDao;
import com.ol.model.dao.EmpHistoryDaoImpl;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.EmpHistory;

public class EmpHistorySrv {
	//Sonnv
	public Integer insert(EmpHistory empHis){
		Integer result = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmpHistoryDao empHisDao = new EmpHistoryDaoImpl();
			empHisDao.insertWithSql(empHis);
			transaction.commit();
			result = 1;
		}finally{
			transaction.rollback();
		}
		return result;
	}
}
