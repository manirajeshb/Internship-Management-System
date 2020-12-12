package com.uncc.internship.model;

import java.io.Serializable;

public class Paperwork implements Serializable {


	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `PlacementId` VARCHAR(15) NOT NULL, `StudentEvaluation` VARCHAR(45) DEFAULT
	 * 'Generate from view StudentEvaluation', `SupervisorEvaluation` VARCHAR(45)
	 * DEFAULT 'Generate from view SupervisorEvaluation', `CompanyInfo` VARCHAR(45)
	 * DEFAULT 'Generate from view CompanyInfo', `StudentInfo` VARCHAR(45) DEFAULT
	 * 'Generate from view StudentInfo',
	 */

	private String placementID;
	private String studentEvaluation;
	private String supervisorEvaluation;
	private String companyInfo;
	private String studentInfo;

	public String getPlacementID() {
		return placementID;
	}

	public void setPlacementID(String placementID) {
		this.placementID = placementID;
	}

	public String getStudentEvaluation() {
		return studentEvaluation;
	}

	public void setStudentEvaluation(String studentEvaluation) {
		this.studentEvaluation = studentEvaluation;
	}

	public String getSupervisorEvaluation() {
		return supervisorEvaluation;
	}

	public void setSupervisorEvaluation(String supervisorEvaluation) {
		this.supervisorEvaluation = supervisorEvaluation;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}
}
