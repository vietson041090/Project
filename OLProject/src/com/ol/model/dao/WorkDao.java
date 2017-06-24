package com.ol.model.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.ol.model.db.DBConfig;
import com.ol.model.entity.Employee;
import com.ol.model.entity.LoaLetter;
import com.ol.model.entity.Work;

@Dao(config = DBConfig.class)
public interface WorkDao {

	@Select
	public int getWorkIDByEmpIdAndPrjID(int iPrjID, String sEmpID );
	@Delete(sqlFile=true)
	public int deleteWorkByID (int iID);
	@Insert(sqlFile=true)
	public int insertWork(Work work);
	@Update(sqlFile=true)
	public int updateWork(Work work);
	
	//toan
	@Select
	public Employee getNextManOfNextMan(LoaLetter loa);
}
