package com.uncc.internship.model;

import java.io.Serializable;

public class PaidIntern implements Serializable {

	/**
	 * `InternshipID` VARCHAR(15) NOT NULL, `TotalSalary` DOUBLE NULL, `WorkType`
	 * VARCHAR(45) NULL,
	 */
	private static final long serialVersionUID = -3465813074586302847L;
	private String internshipID;

	private Double totalSalary;

	private String workType;

	public String getInternshipID() {
		return internshipID;
	}

	public void setInternshipID(String internshipID) {
		this.internshipID = internshipID;
	}

	public Double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(Double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}
}
