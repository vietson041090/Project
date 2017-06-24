package com.ol.model.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class ProjectMember implements Serializable{

	/**
	 * Author: 			LTToan
	 * Created date: 	05/12/2014
	 * Description: 	Contain project's member information
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "iID")
	private String iWorkID;
	
	@Column(name = "sID")
	public String sEmployeeId;
	
	@Column(name = "sFullName")
	public String sEmployeeName;
	//private Date emloyeeBirthDay;
	//private Date employeeStartDay;
	//private String employeeEmail;
	//private int maxLDay;
	//private int type;
	//private int status;
	
	//private int projectId;
	@Column(name = "iRolID")
	public int iRoleID;
	
	@Column(name = "sManID")
	public String sManagerId;
	
	@Column(name = "sManFullName")
	public String sManagerName;

	@Column(name= "sDisplay")
	public String sDisplay;
	
	public String getSDisplay() {
		return sDisplay;
	}

	public void setSDisplay(String sDisplay) {
		this.sDisplay = sDisplay;
	}

	public String getSEmployeeId() {
		return sEmployeeId;
	}

	public void setSEmployeeId(String sEmployeeId) {
		this.sEmployeeId = sEmployeeId;
	}

	public String getSEmployeeName() {
		return sEmployeeName;
	}

	public void setSEmployeeName(String sEmployeeName) {
		this.sEmployeeName = sEmployeeName;
	}

	public int getIRoleID() {
		return iRoleID;
	}

	public void setIRoleID(int iRoleID) {
		this.iRoleID = iRoleID;
	}

	public String getSManagerId() {
		return sManagerId;
	}

	public void setSManagerId(String sManagerId) {
		this.sManagerId = sManagerId;
	}

	public String getSManagerName() {
		return sManagerName;
	}

	public void setSManagerName(String sManagerName) {
		this.sManagerName = sManagerName;
	}

	public String getIWorkID() {
		return iWorkID;
	}

	public void setIWorkID(String iWorkID) {
		this.iWorkID = iWorkID;
	}
}
