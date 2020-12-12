package com.uncc.internship.model;

import java.io.Serializable;

public class InternshipSkill implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	private String skillID;
	private String internshipID;

	/*
	 * `SkillID` VARCHAR(15) NOT NULL, `InternshipID` VARCHAR(15) NOT NULL,
	 */
	public String getSkillID() {
		return skillID;
	}

	public void setSkillID(String skillID) {
		this.skillID = skillID;
	}

	public String getInternshipID() {
		return internshipID;
	}

	public void setInternshipID(String internshipID) {
		this.internshipID = internshipID;
	}
}
