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
public class WorkRole implements Serializable {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;
	//Variables
	@Id
	@Column(name = "iID")
	private int iID;

	@Column(name = "sRoleTitle")
	private String sRoleTitle;

	public int getIID() {
		return iID;
	}

	public void setIID(int iID) {
		this.iID = iID;
	}

	public String getSRoleTitle() {
		return sRoleTitle;
	}

	public void setSRoleTitle(String sRoleTitle) {
		this.sRoleTitle = sRoleTitle;
	}


}
