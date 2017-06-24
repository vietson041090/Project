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

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_Work")
public class Work implements Serializable {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;
	//Variables
	@Id
	@Column(name = "iID")
	private int iID;

	@Column(name = "sEmpID")
	private String sEmpID;

	@Column(name = "iPrjID")
	private int iPrjID;

	@Column(name = "iRolID")
	private int iRolID;
	
	@Column(name = "sManID")
	private String sManID;
	
	@Column(name = "iStatus")
	private int iStatus;
	
	//Getter & Setter
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

	public int getIRolID() {
		return iRolID;
	}

	public void setIRolID(int iRolID) {
		this.iRolID = iRolID;
	}

	public String getSManID() {
		return sManID;
	}

	public void setSManID(String sManID) {
		this.sManID = sManID;
	}

	public int getIStatus() {
		return iStatus;
	}

	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}
}
