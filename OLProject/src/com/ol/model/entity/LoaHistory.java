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
import java.sql.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_LoaHistory")
public class LoaHistory implements Serializable {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;
	//Variables
	@Id
	@Column(name = "iID")
	private int iID;

	@Column(name = "iLoaID")
	private int iLoaID;

	@Column(name = "sManID")
	private String sManID;

	@Column(name = "iOldSatus")
	private int iOldSatus;
	
	@Column(name = "iStatus")
	private int iStatus;
	
	@Column(name = "sNote")
	private String sNote;

	@Column(name = "dChgDate")
	private Date dChgDate;

	public int getiID() {
		return iID;
	}

	//getter vs setter
	public void setIID(int iID) {
		this.iID = iID;
	}

	public int getILoaID() {
		return iLoaID;
	}

	public void setILoaID(int iLoaID) {
		this.iLoaID = iLoaID;
	}

	public String getSManID() {
		return sManID;
	}

	public void setSManID(String sManID) {
		this.sManID = sManID;
	}

	public int getIOldSatus() {
		return iOldSatus;
	}

	public void setIOldSatus(int iOldSatus) {
		this.iOldSatus = iOldSatus;
	}

	public int getIStatus() {
		return iStatus;
	}

	public void setIStatus(int iStatus) {
		this.iStatus = iStatus;
	}

	public String getSNote() {
		return sNote;
	}

	public void setSNote(String sNote) {
		this.sNote = sNote;
	}

	public Date getDChgDate() {
		return dChgDate;
	}

	public void setDChgDate(Date dChgDate) {
		this.dChgDate = dChgDate;
	}
}
