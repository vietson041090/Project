
package com.ol.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.seasar.doma.jdbc.tx.LocalTransaction;

import com.mysql.fabric.xmlrpc.base.Array;
import com.ol.model.db.DBConfig;
import com.ol.model.entity.Employee;
import com.ol.model.entity.EmployeeCombobox;
import com.ol.model.entity.TodayLetter;
import com.ol.model.entity.Work;
import com.ol.model.dao.EmployeeDao;
import com.ol.model.dao.EmployeeDaoImpl;
import com.ol.model.dao.WorkDao;
import com.ol.model.dao.WorkDaoImpl;

public class EmployeeSrv {

	public List<Employee> listUser() {

		List<Employee> result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.selectAll();
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//nam
	public Employee getProfile(String empID) {

		Employee result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.selectByID(empID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}

	//Sonnv
	public Integer login(String sID, String sPassword){
		Integer count = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			count = employeeDao.selectCountByIDPass(sID, sPassword);
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return count;
	}

	public List<EmployeeCombobox> selectComboboxList()
	{
		List<EmployeeCombobox>  result = null;


		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.selectComboboxList();
			tx.commit();


		} finally {
			tx.rollback();

		}
		return result;
	}




	//tuan: get password
	public String getPasswordById(String sID) {
		String result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.selectPasswordByID(sID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}


	//tuan: update password
	public int updatePasswordById(String sID, String newPassword) {

		int result = 0;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			emp.updatePasswordByID(sID, newPassword);
			tx.commit();
			result = 1;
		} finally {
			tx.rollback();

		}
		System.out.println("RESULT " + result);
		return result;
	}


	//tuan: check password
	public int checkPasswordExist(String sID, String sPassWord) {

		int result = 0;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.checkPasswordExist(sID, sPassWord);
			tx.commit();
			//result = 1;
		} finally {
			tx.rollback();

		}
		System.out.println("RESULT " + result);
		return result;
	}
	
	
	//tuan: check ID
		public int checkIDExist(String sID) {

			int result = 0;

			LocalTransaction tx = DBConfig.getLocalTransaction();
			try {
				tx.begin();
				EmployeeDao emp = new EmployeeDaoImpl();
				result = emp.checkIDExist(sID);
				tx.commit();
				//result = 1;
			} finally {
				tx.rollback();

			}
			System.out.println("RESULT " + result);
			return result;
		}


	//tuan: get user information
	public Employee getEmployeeById(String sID) {

		Employee result = null;

		LocalTransaction tx = DBConfig.getLocalTransaction();
		try {
			tx.begin();
			EmployeeDao emp = new EmployeeDaoImpl();
			result = emp.selectEmpByID(sID);
			tx.commit();

		} finally {
			tx.rollback();

		}
		return result;
	}
	
	
	//tuan: insert new user 
	public int newEmployee(Employee employee) {

			int result = 0;

			LocalTransaction tx = DBConfig.getLocalTransaction();
			try {
				tx.begin();
				EmployeeDao emp = new EmployeeDaoImpl();
				result = emp.insertEmployee(employee);
				tx.commit();

			} finally {
				tx.rollback();

			}
			System.out.print("RESULT " + result);
			return result;
		}
	
	//tuan: update user 
	public int updateEmployee(Employee employee) {

				int result = 0;

				LocalTransaction tx = DBConfig.getLocalTransaction();
				try {
					tx.begin();
					EmployeeDao emp = new EmployeeDaoImpl();
					result = emp.updateSql(employee);
					tx.commit();

				} finally {
					tx.rollback();

				}
				System.out.print("RESULT " + result);
				return result;
			}
	
	//sonnv
	public List<TodayLetter> selectTodayLetter(){
		List<TodayLetter> todayLetter = new ArrayList<TodayLetter>();
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			todayLetter = employeeDao.selectTodayLetter();
			transaction.commit();
		}
		finally{
			transaction.rollback();
		}
		return todayLetter;
	}

	
	//sonnv
	public List<Employee> selectEmpPrj(){
		List<Employee> listEmpPrj = new ArrayList<Employee>();
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			listEmpPrj = employeeDao.selectEmpPrj();
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return listEmpPrj;
	}
	
	//Sonnv
	public Integer deleteEmpByID(ArrayList<String> sID){
		int result = 0;
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			employeeDao.deleteEmpByID(sID);
			transaction.commit();
			result = 1;
		}finally{
			transaction.rollback();
		}
		return result;
	}
	
	//Sonnv
	public List<Employee> searchEmpPrj(String searchField, String searchValue){
		List<Employee> lsSearchEmpPrj = new ArrayList<Employee>();
		LocalTransaction transaction = DBConfig.getLocalTransaction();
		try{
			transaction.begin();
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			lsSearchEmpPrj=employeeDao.searchEmpPrj(searchField, searchValue);
			transaction.commit();
		}finally{
			transaction.rollback();
		}
		return lsSearchEmpPrj;
	}
	
	
	//tuan
			public int saveEmployee(Employee employee, List<Work> works){
				int result=0;
				LocalTransaction tx = DBConfig.getLocalTransaction();
				try {
					tx.begin();

					EmployeeDao employeeDao = new EmployeeDaoImpl();
					WorkDao workDao = new WorkDaoImpl();
					result = employeeDao.insertEmployee(employee);
					
					if(result > 0){
						//get loa_id
						//int loa_id = employeeDao.getLastEmployeeIDByEmpID(loa.getSEmpID(),loa.getIPrjID());
						//if(loa_id > 0){
							for(int i=0;i< works.size();i++){
								//more.get(i).setILoaID(loa_id);
								works.get(i).setIStatus(1);
								works.get(i).setSEmpID(employee.getSID());
								result = workDao.insertWork(works.get(i));
								if(result < 1) {
									result = 0;
									break;
								}
							}
						//}
					}

					if(result>0) tx.commit();
					else tx.rollback();

				} finally {
					tx.rollback();

				}
				return result;
			}

}