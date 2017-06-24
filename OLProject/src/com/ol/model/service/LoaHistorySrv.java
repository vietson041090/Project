package com.ol.model.service;

import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.ol.model.dao.LoaHistoryDao;
import com.ol.model.dao.LoaHistoryDaoImpl;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.LoaHistory;
import com.ol.model.entity.LoaHistoryInfo;

public class LoaHistorySrv {

	//toan
	public Integer insertLoaHistory(LoaHistory loaHistory){
		Integer result = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			LoaHistoryDao loaHistoryDao = new LoaHistoryDaoImpl();
			result = loaHistoryDao.insertLoaHistory(loaHistory);
			
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return result;
	}
	
	//Sonnv
	public List<LoaHistoryInfo> selectAllInfo(String sEmpID){
		List<LoaHistoryInfo> loaHis = new ArrayList<LoaHistoryInfo>();
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			LoaHistoryDao loaHistoryDao = new LoaHistoryDaoImpl();
			loaHis = loaHistoryDao.selectAllInfo(sEmpID);
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return loaHis;
	}
}
