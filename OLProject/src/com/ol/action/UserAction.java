package com.ol.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.helper.Ulti;
import com.ol.model.entity.Employee;
import com.ol.model.service.EmployeeSrv;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@Namespace("/")
public class UserAction extends ActionSupport implements Preparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Employee> listEmpPrj;
	private Employee emp = new Employee();
	private ArrayList<String> empCheck;

	public ArrayList<String> getEmpCheck() {
		return empCheck;
	}

	public void setEmpCheck(ArrayList<String> empCheck) {
		this.empCheck = empCheck;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public List<Employee> getListEmpPrj() {
		return listEmpPrj;
	}

	public void setListEmpPrj(List<Employee> listEmpPrj) {
		this.listEmpPrj = listEmpPrj;
	}
	
	@Action(value = "view_Emp", results = { @Result(name = "view", type="tiles", location = "view_listEmpPrj") })
	public String view(){
		if(Ulti.isInvalidRights(1)) return "login";
		return "view";
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		getLsEmps();
	}
	
	public void getLsEmps(){
		EmployeeSrv empSrv = new EmployeeSrv();
		List<Employee> list = empSrv.selectEmpPrj();
		this.setListEmpPrj(list);
	}
	
	@Action(value="delete", 
			results = {@Result(name="success", type ="tiles", location="view_listEmpPrj"),
						@Result(name="error", type ="tiles", location="error")})
	public String executeDel() {
		if(Ulti.isInvalidRights(1)) return "login";
		for(String s: empCheck){
			System.out.print(s);
		}
		
		EmployeeSrv empSrv = new EmployeeSrv();
		int result = empSrv.deleteEmpByID(empCheck);
		if(result==1){
			getLsEmps();
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	private String searchField;
	private String searchValue;
	
	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	@Action(value="searchEmpPrj", results={@Result(name="success", type="tiles", location="view_listEmpPrj")})
	public String executeSearch(){
		if(Ulti.isInvalidRights(1)) return "login";
		EmployeeSrv empSrv = new EmployeeSrv();
		System.out.println("field: " + this.getSearchField());
		System.out.println("value: " + this.getSearchValue());
		List<Employee> list = empSrv.searchEmpPrj(searchField, searchValue);
		this.setListEmpPrj(list);
		return SUCCESS;
	}
}
