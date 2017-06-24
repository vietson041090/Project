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
import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class EmployeeCombobox implements Serializable {

	//test add one
	@Transient
	private static final long serialVersionUID = 1L;

	
	@Column(name = "sID")
	private String sID;
	
	@Column(name = "sFullName")
	private String sFullName;
	
	private String sDisplay;
	
	public String getSID() {
		return sID;
	}

	public void setSID(String sID) {
		this.sID = sID;
	}

	public String getSFullName() {
		return sFullName;
	}

	public void setSFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public String getSDisplay() {
		return sDisplay;
	}

	public void setSDisplay(String sDisplay) {
		this.sDisplay = sDisplay;
	}


	
}
