package com.ol.action;

/**
 * Author: 			
 * Created date: 	
 * Description: 	Implementing 
 * Related:			Struts 2, Annotation, Log4j
 */

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import com.ol.helper.PagingByDB;
import com.ol.helper.Ulti;
import com.ol.model.entity.Employee;
import com.ol.model.entity.ProjectInformation;
import com.ol.model.entity.TimeLoa;
import com.ol.model.entity.DayLoa;

import com.ol.model.service.LoaLetterSrv;

@Namespace("/")
public class TimeReportAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;
	private static Logger log4j = LogManager.getLogger(ProfileAction.class);

	private Employee emp = new Employee();

	private Date fromday;
	private Date today;
	private String empID;
	private int prjID;

	private PagingByDB pgList;

	public PagingByDB getPgList() {
		return pgList;
	}

	public void setPgList(PagingByDB pgList) {
		this.pgList = pgList;
	}

	private List<ProjectInformation> pList;
	public List<TimeLoa> TimetList = new ArrayList<TimeLoa>();
	public List<TimeLoa> getTimetList() {
		return TimetList;
	}
	public void setTimetList(List<TimeLoa> timetList) {
		TimetList = timetList;
	}

	public List<DayLoa> dayList = new ArrayList<DayLoa>();
	public List<DayLoa> getDayList() {
		return dayList;
	}
	public void setDayList(List<DayLoa> dList) {
		dayList = dList;
	}

	public List<ProjectInformation> getPList() {
		return pList;
	}

	public void setPList(List<ProjectInformation> pList) {
		this.pList = pList;
	}

	public Date getFromday() {
		return fromday;
	}

	public void setFromday(String fromday) {
		this.fromday = Ulti.convertToDate(fromday, "yyyy/MM/dd");
	}

	public Date getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = Ulti.convertToDate(today, "yyyy/MM/dd");
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public int getPrjID() {
		return prjID;
	}

	public void setPrjID(int prjID) {
		this.prjID = prjID;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee newemp) {
		this.emp = newemp;
	}

	@Override
	public void prepare() throws Exception {
		pList= Ulti.getProjectSelectList();

	}

	// nam
	@Action(value = "time_report", results = { @Result(name = "success", type = "tiles", location = "time_report") })
	public String time_report() {
		try {
			//check rights
			if(Ulti.isInvalidRights(2)) return "login";

			if(this.getEmpID()!=null && this.getEmpID().length() > 0 && Ulti.isInvalidStrVar(this.getEmpID(), 1, 50)) addActionError("Ma nhan vien khong hop le");
			if (!hasErrors()) {
				pgList = new PagingByDB(10, "SentDay", "DESC");
				pgList.getRequestParam();

				LoaLetterSrv srv = new LoaLetterSrv();
				TimetList = srv.getTimeLoaList(this.getFromday(), this.getToday(),this.getEmpID(),this.getPrjID(),pgList.pageNo,pgList.pageSize,pgList.sortColumn,pgList.sortDir);

				pgList.total = srv.getTotalTimeLoaList(this.getFromday(), this.getToday(),this.getEmpID(),this.getPrjID(),pgList.pageNo,pgList.pageSize,pgList.sortColumn,pgList.sortDir);
				pgList.dataList = TimetList;

				//System.out.print("----" + TimetList.get(0).EmpName);
			}

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

	// nam
	@Action(value = "day_report", results = { @Result(name = "success", type = "tiles", location = "day_report") })
	public String day_report() {
		try {
			if(Ulti.isInvalidRights(2)) return "login";
			if(this.getEmpID()!=null && this.getEmpID().length() > 0 && Ulti.isInvalidStrVar(this.getEmpID(), 1, 50)) addActionError("Ma nhan vien khong hop le");
			if (!hasErrors()) {
				pgList = new PagingByDB(10, "SentDay", "DESC");
				pgList.getRequestParam();

				LoaLetterSrv srv = new LoaLetterSrv();
				dayList = srv.getDayLoaList(this.getFromday(), this.getToday(),this.getEmpID(),this.getPrjID(),pgList.pageNo,pgList.pageSize,pgList.sortColumn,pgList.sortDir);

				pgList.total = srv.getTotalDayLoaList(this.getFromday(), this.getToday(),this.getEmpID(),this.getPrjID());;
				pgList.dataList = dayList;

				//System.out.print("----" + dayList.get(0).EmpName);
			}

		} catch (Exception ex) {
			return "error";
		}

		return SUCCESS;
	}

}
