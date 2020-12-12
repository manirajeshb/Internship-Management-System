package com.uncc.internship.model;

import java.io.Serializable;

public class Supervisor implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `SupervisorID` VARCHAR(15) NOT NULL, `Name` VARCHAR(45) NOT NULL, `Email`
	 * VARCHAR(45) NOT NULL, `WorkPhone` VARCHAR(15) NULL, `OfficeAddress`
	 * VARCHAR(90) NULL, `CompanyID` VARCHAR(90) NOT NULL,
	 */

	private String supervisorID;
	private String name;
	private String email;
	private String workPhone;
	private String officeAddress;
	private String companyID;

	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
}
