package com.uncc.internship.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `EmployeeID` VARCHAR(15) NOT NULL, `OfficePhone` VARCHAR(45) NULL,
	 * `OfficeAdd` VARCHAR(255) NULL,
	 */
	private String employeeId;
	private String officePhone;
	private String officeAddress;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

}
