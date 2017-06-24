package com.ol.model.entity;

import java.io.Serializable;
import java.sql.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.entity.NamingType;

//nam
@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class DayLoa  implements Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Column(name = "EmpName")
	public String EmpName;
	
	@Column(name = "AllLoaDay")
	public float AllLoaDay;
	
	@Column(name = "OkLoaDay")
	public Date OkLoaDay;
	
	@Column(name = "ProjectName")
	public String ProjectName;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public float getAllLoaDay() {
		return AllLoaDay;
	}

	public void setAllLoaDay(float allLoaDay) {
		AllLoaDay = allLoaDay;
	}

	public Date getOkLoaDay() {
		return OkLoaDay;
	}

	public void setOkLoaDay(Date okLoaDay) {
		OkLoaDay = okLoaDay;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
		
	
	
}
