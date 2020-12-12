package com.uncc.internship.model;

import java.io.Serializable;

public class FallPlacementView implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * CREATE OR REPLACE VIEW `FallPlacement` AS SELECT distinct
	 * placement.placementID, person.name as studentName, company.CompanyName,
	 * supervisor.name as supervisorName, application.internshipId, notes
	 */
	private String placementID;
	private String studentName;
	private String companyName;
	private String supervisorName;
	private String internshipId;
	private String notes;

	public String getPlacementID() {
		return placementID;
	}

	public void setPlacementID(String placementID) {
		this.placementID = placementID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getInternshipId() {
		return internshipId;
	}

	public void setInternshipId(String internshipId) {
		this.internshipId = internshipId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
