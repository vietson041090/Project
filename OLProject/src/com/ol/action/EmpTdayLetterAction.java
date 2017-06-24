package com.ol.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.model.entity.TodayLetter;
import com.ol.model.service.EmployeeSrv;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class EmpTdayLetterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TodayLetter> lsTodayLetter;
	
	public List<TodayLetter> getLsTodayLetter() {
		return lsTodayLetter;
	}

	public void setLsTodayLetter(List<TodayLetter> lsTodayLetter) {
		this.lsTodayLetter = lsTodayLetter;
	}
	
//	@Action(value = "lsLetter", results = { @Result(name = "success", type="tiles", location = "login") })
//	public String execute(){
//		System.out.println("Load letter");
//		EmployeeSrv employeeSrv = new EmployeeSrv();
//		List<TodayLetter> list = employeeSrv.selectTodayLetter();
//		this.setLsTodayLetter(list);
//		System.out.println(list.get(0).getSEmpID()+""+list.get(0).getSFullname());
//		return SUCCESS;
//	}
}
