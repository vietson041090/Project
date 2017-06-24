package com.ol.model.entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Entity
@Table(name = "OL_EmpHistory")
public class EmpHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String sEmpID;
	
	@Column 
	private String sWhatDo;
	
	public String getSEmpID() {
		return sEmpID;
	}

	public void setSEmpID(String sEmpID) {
		this.sEmpID = sEmpID;
	}

	public String getSWhatDo() {
		return sWhatDo;
	}

	public void setSWhatDo(String sWhatDo) {
		this.sWhatDo = sWhatDo;
	}

	@Column
	private String dWhen;

	public String getdWhen() {
		return dWhen;
	}

	public void setdWhen(String dWhen) {
		this.dWhen = dWhen;
	}
}
