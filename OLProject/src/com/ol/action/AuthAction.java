package com.ol.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.ol.model.entity.EmpHistory;
import com.ol.model.entity.Employee;
import com.ol.model.entity.TodayLetter;
import com.ol.model.service.EmpHistorySrv;
import com.ol.model.service.EmployeeSrv;
import com.ol.model.service.LoaLetterSrv;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

@Namespace("/")
@InterceptorRef(value = "defaultStack")
public class AuthAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(AuthAction.class);
	private Employee emp = new Employee();
	private List<TodayLetter> listLetter = new ArrayList<TodayLetter>();
	private int result = 0;
	private EmpHistory empHis = new EmpHistory();

	public EmpHistory getEmpHis() {
		return empHis;
	}

	public void setEmpHis(EmpHistory empHis) {
		this.empHis = empHis;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<TodayLetter> getListLetter() {
		return listLetter;
	}

	public void setListLetter(List<TodayLetter> listLetter) {
		this.listLetter = listLetter;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	private Integer count = 0;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	// sonnv
	@Action(value = "login", results = { @Result(name = "success", type = "tiles", location = "login") })
	public String viewLogin() {
		this.loadTodayLoa();
		return SUCCESS;
	}

	// sonnv
	public String getDateWhen() {
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date date = new java.util.Date();
		String dWhen = dateformat.format(date);
		return dWhen;
	}

	// sonnv
	@Action(value = "dologin", results = {
			@Result(name = "error", type = "tiles", location = "login"),
			@Result(name = "success", type = "redirectAction", params = {
					"actionName", "index.action" }) })
	public String loginUser() {
		log4j.error("---------------loginUser run");
		if (this.emp.getSID().equals(""))
			addActionError("The Username is required.");
		if (this.emp.getSPassword().equals(""))
			addActionError("The password is required.");

		if (getActionErrors().isEmpty()) {
			EmployeeSrv employeeSrv = new EmployeeSrv();
			count = employeeSrv.login(emp.getSID(), emp.getSPassword());
			if (count == 1) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("loggedEmpID", this.emp.getSID());

				EmployeeSrv srv = new EmployeeSrv();
				this.setEmp(srv.getProfile(this.emp.getSID()));
				ServletActionContext
						.getRequest()
						.getSession()
						.setAttribute("loggedFullname", this.emp.getSFullname());
				ServletActionContext.getRequest().getSession()
						.setAttribute("loggedType", this.emp.getIType());
				Date d = new Date();
				ServletActionContext.getRequest().getSession()
						.setAttribute("loggedTime", d.toString());

				insertEmpHis();
				return SUCCESS;
			} else
				addActionError("Login failed.");
		}
		return ERROR;
	}

	// Toan
	@Action(value = "logout", results = {
			@Result(name = "success", location = "login", type = "tiles"),
			@Result(name = "error", location = "login", type = "tiles") })
	public String logoutUser() {

		Map<String, Object> session = ActionContext.getContext().getSession();
		String loggedEmpID = (String) session.get("loggedEmpID");

		if (loggedEmpID == null) {
			addActionError("You have already logout!");
			return "error";
		} else {
			// TODO
			// Add log to database
			EmpHistorySrv empHisService = new EmpHistorySrv();
			EmpHistory empHis = new EmpHistory();
			empHis.setdWhen(getDateWhen());
			empHis.setSEmpID((String) session.get("loggedEmpID"));
			empHis.setSWhatDo("Logout");
			empHisService.insert(empHis);

			session.clear();
			addActionError("You have successfully logout!");
			return "success";
		}

	}

	public void insertEmpHis() {
		EmpHistorySrv employHisSrv = new EmpHistorySrv();
		this.empHis.setSEmpID(this.emp.getSID());
		System.out.println(this.empHis.getSEmpID());
		this.empHis.setSWhatDo("Login");
		this.empHis.setdWhen(getDateWhen());
		this.setResult(employHisSrv.insert(empHis));
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		this.loadTodayLoa();
	}

	private void loadTodayLoa() {
		EmployeeSrv employeeSrv = new EmployeeSrv();
		List<TodayLetter> list = employeeSrv.selectTodayLetter();
		this.setListLetter(list);
	}

}