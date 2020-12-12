package com.uncc.internship.model;

import java.io.Serializable;

public class UnpaidIntern implements Serializable {

	/**
	 * `InternshipID` VARCHAR(15) NOT NULL, `AcademicCredit` VARCHAR(45) NOT NULL,
	 */
	private static final long serialVersionUID = -3465813074586302847L;
	private String internshipID;

	private String academicCredit;

	public String getInternshipID() {
		return internshipID;
	}

	public void setInternshipID(String internshipID) {
		this.internshipID = internshipID;
	}

	public String getAcademicCredit() {
		return academicCredit;
	}

	public void setAcademicCredit(String academicCredit) {
		this.academicCredit = academicCredit;
	}


}
