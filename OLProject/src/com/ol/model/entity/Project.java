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
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_Project")
public class Project implements Serializable {

	
	@Transient
	private static final long serialVersionUID = 1L;
	//Variables
	@Id
	@Column(name = "iID")
	private int iID;

	@Column(name = "sCode")
	private String sCode;

	@Column(name = "sFullname")
	private String sFullname;

	@Column(name = "sPmID")
	private String sPmID;
	
	@Column(name = "dStartday")
	private Date dStartday;
	
	@Column(name = "iStatus")
	private int iStatus;
	//Getter & Setter
	public int getIID() {
		return iID;
	}

	public void setIID(int iID) {
		this.iID = iID;
	}

	public String getSCode() {
		return sCode;
	}

	public void setSCode(String sCode) {
		this.sCode = sCode;
	}

	public String getSFullname() {
		return sFullname;
	}

	public void setSFullname(String sFullname) {
		this.sFullname = sFullname;
	}

	public String getSPmID() {
		return sPmID;
	}

	public void setSPmID(String sPmID) {
		this.sPmID = sPmID;
	}

	public Date getDStartday() {
		return dStartday;
	}

	public void setDStartday(Date dStartday) {
		this.dStartday = dStartday;
	}

	public int getIStatus() {
		return iStatus;
	}

	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}
	
}
