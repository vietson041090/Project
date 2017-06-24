package com.ol.model.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.EmpHistory;

@Dao(config=DBConfig.class)
public interface EmpHistoryDao {
	//Sonnv
	@Insert(sqlFile=true)
	int insertWithSql(EmpHistory empHis);
}
