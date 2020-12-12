package com.uncc.internship.model;

import java.io.Serializable;

public class Faculty implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `FacID` VARCHAR(15) NOT NULL, `Dept` VARCHAR(45) NULL, `Type` VARCHAR(45)
	 * NULL,
	 */
	private String facId;
	private String dept;
	private String type;

	public String getFacId() {
		return facId;
	}

	public void setFacId(String facId) {
		this.facId = facId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
