/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    :
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/


package com.ol.model.entity;

import java.io.Serializable;
import java.sql.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class PersonalLoaLetter implements Serializable {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;
	@Column(name = "iID")
	private int iID;
	
	@Column(name = "sEmpID")
	private String sEmpID;

	@Column(name = "iPrjID")
	private int iPrjID;

	@Column(name = "dSentday")
	private Date dSentday;
	
	@Column(name = "sNextManID")
	private String sNextManID;
	
	@Column(name = "iStatus")
	private int iStatus;

	@Column(name = "sCode")
	private String sCode;
	
	@Column(name = "sFullName")
	private String sFullName;

	public String getSEmpID() {
		return sEmpID;
	}

	public void setSEmpID(String sEmpID) {
		this.sEmpID = sEmpID;
	}

	public int getIPrjID() {
		return iPrjID;
	}

	public void setIPrjID(int iPrjID) {
		this.iPrjID = iPrjID;
	}

	public Date getDSentday() {
		return dSentday;
	}

	public void setDSentday(Date dSentday) {
		this.dSentday = dSentday;
	}

	public String getSNextManID() {
		return sNextManID;
	}

	public void setSNextManID(String sNextManID) {
		this.sNextManID = sNextManID;
	}

	public int getIStatus() {
		return iStatus;
	}

	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}

	public String getSCode() {
		return sCode;
	}

	public void setSCode(String sCode) {
		this.sCode = sCode;
	}

	public String getSFullName() {
		return sFullName;
	}

	public void setSFullNamed(String sFullName) {
		this.sFullName = sFullName;
	}

	public int getIID() {
		return iID;
	}

	public void setIID(int iID) {
		this.iID = iID;
	}
}
