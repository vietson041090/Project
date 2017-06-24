package com.ol.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity
@Table(name = "OL_Employee")
public class Employee implements Serializable {
	//Variables
	@Id
	@Column(name = "sID")
	private String sID;
	
	@Column(name = "sPassword")
	private String sPassword;
	
	@Column(name = "sFullname")
	private String sFullname;
	
	@Column(name = "dBirthday")
	private Date dBirthday;
	
	@Column(name = "dStartday")
	private Date dStartday;
	
	@Column(name = "sEmail")
	private String sEmail;
	
	@Column(name = "iMaxlday")
	private int iMaxlday;
	
	@Column(name = "iType")
	private int iType;
	
	@Column(name = "iStatus")
	private int iStatus;
	
	//Getter & setter
	public String getSID() {
		return sID;
	}
	public void setSID(String sID) {
		this.sID = sID;
	}
	public String getSPassword() {
		return sPassword;
	}
	public void setSPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	public String getSFullname() {
		return sFullname;
	}
	public void setSFullname(String sFullname) {
		this.sFullname = sFullname;
	}
	public Date getDBirthday() {
		return dBirthday;
	}
	public void setDBirthday(Date dBirthday) {
		this.dBirthday = dBirthday;
	}
	public Date getDStartday() {
		return dStartday;
	}
	public void setDStartday(Date dStartday) {
		this.dStartday = dStartday;
	}
	public String getSEmail() {
		return sEmail;
	}
	public void setSEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public int getIMaxlday() {
		return iMaxlday;
	}
	public void setIMaxlday(int iMaxlday) {
		this.iMaxlday = iMaxlday;
	}
	public int getIType() {
		return iType;
	}
	public void setIType(int iType) {
		this.iType = iType;
	}
	public int getIStatus() {
		return iStatus;
	}
	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}
	
	//nam
	@Transient
	private static final long serialVersionUID = 1L;
	@Transient
	private float iOkLoa = 0;
	@Transient
	private float iMonthLoa = 0;
	public float getIMonthLoa() {
		return iMonthLoa;
	}
	public void setIMonthLoa(float iMonthLoa) {
		this.iMonthLoa = iMonthLoa;
	}

	@Transient
	private float iMaxYearLoa = 0;
	public float getIOkLoa() {
		return iOkLoa;
	}
	public void setIOkLoa(float iOkLoa) {
		this.iOkLoa = iOkLoa;
	}
	public float getIMaxYearLoa() {
		return iMaxYearLoa;
	}
	public void setIMaxYearLoa(float iMaxYearLoa) {
		this.iMaxYearLoa = iMaxYearLoa;
	}
	
	//Sonnv
	@Column(name = "iPrjID")
	private int iPrjID;

	public int getIPrjID() {
		return iPrjID;
	}
	public void setIPrjID(int iPrjID) {
		this.iPrjID = iPrjID;
	}
	
	@Column(name = "sPrjName")
	private String sPrjName;

	public String getSPrjName() {
		return sPrjName;
	}
	public void setSPrjName(String sPrjName) {
		this.sPrjName = sPrjName;
	}
	
	@Column(name = "sType")
	private String sType;

	public String getSType() {
		return sType;
	}
	public void setSType(String sType) {
		this.sType = sType;
	}
}
