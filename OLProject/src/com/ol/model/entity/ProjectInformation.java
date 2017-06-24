package com.ol.model.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class ProjectInformation extends Project implements Serializable{

	/**
	 * Author: 			LTToan
	 * Created date: 	05/11/2014
	 * Description: 	extends Project entity, add more attributes to show on screen
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "sPMName")
	private String sPMName;
	
	@Column(name = "iMemberCount")
	private int iMemberCount;

	public String getSPMName() {
		return sPMName;
	}

	public void setSPMName(String sPMName) {
		this.sPMName = sPMName;
	}

	public int getIMemberCount() {
		return iMemberCount;
	}

	public void setIMemberCount(int iMemberCount) {
		this.iMemberCount = iMemberCount;
	}
}
