package com.ol.model.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class LoaHistoryInfo extends LoaHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="sKetQua")
	private String sKetQua;
	
	@Column(name="sFullname")
	private String sFullname;
	
	@Column(name="sEmpID")
	private String sEmpID;

	public String getSEmpID() {
		return sEmpID;
	}

	public void setSEmpID(String sEmpID) {
		this.sEmpID = sEmpID;
	}

	public String getSKetQua() {
		return sKetQua;
	}

	public void setSKetQua(String sKetQua) {
		this.sKetQua = sKetQua;
	}

	public String getSFullname() {
		return sFullname;
	}

	public void setSFullname(String sFullname) {
		this.sFullname = sFullname;
	}
}
