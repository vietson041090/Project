package com.ol.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.seasar.doma.*;
import com.ol.model.entity.Employee;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.TodayLetter;
import com.ol.model.db.DBConfig;

@Dao(config = DBConfig.class)
public interface EmployeeDao {

	@Select
	public List<Employee> selectAll();
	
	@Select
	public Employee selectByID(String empID);
	
	//Sonnv
	@Select
	public Integer selectCountByIDPass(String sID, String sPassword);
	
	@Select 
	List<EmployeeCombobox> selectComboboxList();
	
	// tuan
	@Select
	public String selectPasswordByID(String sID);
	
	// tuan
	@Update(sqlFile=true)
	public int updatePasswordByID(String sID, String newPassword);
	
	// tuan
	@Select
	public int checkPasswordExist(String sID, String sPassWord);
	
	// tuan
	@Select
	public int checkIDExist(String sID);
	
	// tuan
	@Select
	public Employee selectEmpByID(String empID);
	
	// tuan
	@Insert(sqlFile=true)
	public int insertEmployee(Employee employee);
	
	// tuan
	@Update(sqlFile=true)
	public int updateSql(Employee employee);

	//Sonnv
	@Select
	public List<TodayLetter> selectTodayLetter();
	
	//Sonnv
	@Select
	public List<Employee> selectEmpPrj();
	
	//Sonnv
	@Update(sqlFile=true)
	public int deleteEmpByID(ArrayList<String> sID);
	
	//Sonnv
	@Select
	public List<Employee> searchEmpPrj(String searchField, String searchValue);
}
