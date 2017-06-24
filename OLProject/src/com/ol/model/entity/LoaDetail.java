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
import org.seasar.doma.Table;
import org.seasar.doma.Id;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

import com.ol.helper.Ulti;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "OL_LoaDetail")
public class LoaDetail implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;
	//Variables
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY ) 
	@Column(name = "iID")
	private int iID;
	
	@Column(name = "iLoaID")
	private int iLoaID;
	
	@Column(name = "dFromday")
	private Date dFromday;
	
	@Column(name = "dToday")
	private Date dToday;
	
	@Column(name = "iDayno")
	private float iDayno;
	
	@Column(name = "sReason")
	private String sReason;
	
	@Column(name = "iType")
	private int iType;
	
	//Getter vs Setter
	public int getIID() {
		return iID;
	}
	public void setIID(int iID) {
		this.iID = iID;
	}
	public int getILoaID() {
		return iLoaID;
	}
	public void setILoaID(int iLoaID) {
		this.iLoaID = iLoaID;
	}
	public Date getDFromday() {
		return dFromday;
	}
	public void setDFromday(String dFromday) {
		this.dFromday = Ulti.convertToDate(dFromday, "yyyy/MM/dd");
	}
	public Date getDToday() {
		return dToday;
	}
	public void setDToday(String dToday) {
		this.dToday = Ulti.convertToDate(dToday, "yyyy/MM/dd");
	}
	public float getIDayno() {
		return iDayno;
	}
	public void setIDayno(float iDayno) {
		this.iDayno = iDayno;
	}
	public void setIDayno(String iDayno) {
		try{
		this.iDayno =  Float.parseFloat(iDayno);
		}catch(Exception ex){
			this.iDayno = 0;
		}
		
	}
	public String getSReason() {
		return sReason;
	}
	public void setSReason(String sReason) {
		this.sReason = sReason;
	}
	public int getIType() {
		return iType;
	}
	public void setIType(int iType) {
		this.iType = iType;
	}
}
