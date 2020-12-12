package com.uncc.internship.model;

import java.io.Serializable;

public class StudentEvaluationView implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * CREATE OR REPLACE VIEW `StudentEvaluation` AS SELECT companyname, title,
	 * semester, person.name, studentevaluation FROM company, internship, student,
	 * person, paperwork,placement,application
	 */

	private String placementID;

	private String name;

	private String title;
	private String semester;
	private String companyName;

	private String studentEvaluation;

	public String getPlacementID() {
		return placementID;
	}

	public void setPlacementID(String placementID) {
		this.placementID = placementID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStudentEvaluation() {
		return studentEvaluation;
	}

	public void setStudentEvaluation(String studentEvaluation) {
		this.studentEvaluation = studentEvaluation;
	}

}
