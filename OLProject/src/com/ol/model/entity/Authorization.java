/*------------------------------------------------------------------------------ 
Create Date : 2014/05/09
Author    : Ong Oai Viêm
Copyright(c) 2014 DELIVERY. All rights reserved
------------------------------------------------------------------------------
Update History:
Ver.    TRB#        Date          Author       Note
------------------------------------------------------------------------------*/
package com.ol.model.entity;

import java.io.Serializable;
import java.util.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_Authorization")
public class Authorization implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;
	//Varriables
	@Id
	@Column(name = "iID")
	private int iID;
	
	@Column(name = "sEmpID")
	private String sEmpID;
	
	@Column(name = "iWorkID")
	private int iWorkID;
	
	@Column(name = "sToEmpID")
	private String sToEmpID;
	
	@Column(name = "dFromday")
	private Date dFromday;
	
	@Column(name = "dToday")
	private Date dToday;
	
	@Column(name = "iStatus")
	private int iStatus;
	
	//getter & setter
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
	public int getIWorkID() {
		return iWorkID;
	}
	public void setIWorkID(int iWorkID) {
		this.iWorkID = iWorkID;
	}
	public String getSToEmpID() {
		return sToEmpID;
	}
	public void setSToEmpID(String sToEmpID) {
		this.sToEmpID = sToEmpID;
	}
	public Date getDFromday() {
		return dFromday;
	}
	public void setDFromday(Date dFromday) {
		this.dFromday = dFromday;
	}
	public Date getDToday() {
		return dToday;
	}
	public void setDToday(Date dToday) {
		this.dToday = dToday;
	}
	public int getIStatus() {
		return iStatus;
	}
	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}
}
