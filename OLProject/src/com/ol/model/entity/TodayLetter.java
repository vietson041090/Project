package com.ol.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class TodayLetter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="sEmpID")
	private String sEmpID;
	
	@Column(name="sFullname")
	private String sFullname;
	
	public String getSFullname() {
		return sFullname;
	}

	public void setSFullname(String sFullname) {
		this.sFullname = sFullname;
	}

	@Column(name="iDayNo")
	private Integer iDayNo;
	
	public Integer getIDayNo() {
		return iDayNo;
	}

	public void setIDayNo(Integer iDayNo) {
		this.iDayNo = iDayNo;
	}

	public String getSReason() {
		return sReason;
	}

	public void setSReason(String sReason) {
		this.sReason = sReason;
	}

	public Date getDFromday() {
		return dFromday;
	}

	public void setDFromday(Date dFromday) {
		this.dFromday = dFromday;
	}

	@Column(name="sReason")
	private String sReason;
	
	@Column(name="dFromday")
	private Date dFromday;

	public String getSEmpID() {
		return sEmpID;
	}

	public void setSEmpID(String sEmpID) {
		this.sEmpID = sEmpID;
	}
}
