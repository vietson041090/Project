package com.ol.model.entity;

import java.io.Serializable;
import java.sql.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class TimeLoa  implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Column(name = "LoaID")
	public int LoaID;
	
	@Column(name = "SentDay")
	public Date SentDay;
	
	@Column(name = "EmpName")
	public String EmpName;
	
	@Column(name = "FromDay")
	public Date FromDay;
	
	@Column(name = "ToDay")
	public Date ToDay;
	
	
	public int getLoaID() {
		return LoaID;
	}
	public void setLoaID(int loaID) {
		LoaID = loaID;
	}
	public Date getSentDay() {
		return SentDay;
	}
	public void setSentDay(Date sentDay) {
		SentDay = sentDay;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Date getFromDay() {
		return FromDay;
	}
	public void setFromDay(Date fromDay) {
		FromDay = fromDay;
	}
	public Date getToDay() {
		return ToDay;
	}
	public void setToDay(Date toDay) {
		ToDay = toDay;
	}
	
	
	
}
