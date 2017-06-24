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
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;


import com.ol.helper.Ulti;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_LoaLetter")
public class LoaLetter  implements Serializable  {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY ) 
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


	public int getIID() {
		return iID;
	}

	public void setIID(int iID) {
		this.iID = iID;
	}

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

	public void setDSentday(String dSentday) {
		this.dSentday = Ulti.convertToDate(dSentday, "yyyy/MM/dd");
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
}
