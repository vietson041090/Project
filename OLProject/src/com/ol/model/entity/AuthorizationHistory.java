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
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class AuthorizationHistory extends Authorization implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;
	//Varriables
	

	public int getIPrjID() {
		return iPrjID;
	}

	public void setIPrjID(int iPrjID) {
		this.iPrjID = iPrjID;
	}

	public String getSPrjName() {
		return sPrjName;
	}

	public void setSPrjName(String sPrjName) {
		this.sPrjName = sPrjName;
	}

	public String getSFullName() {
		return sFullName;
	}

	public void setSFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	@Column(name = "sFullName")
	private String sFullName;

	@Column(name = "iPrjID")
	private int iPrjID;
	
	@Column(name = "sPrjName")
	private String sPrjName;
	
}
