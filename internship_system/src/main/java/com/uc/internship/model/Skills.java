package com.uncc.internship.model;

import java.io.Serializable;

public class Skills implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	/*
	 * `SkillID` VARCHAR(15) NOT NULL, `SkillDescription` VARCHAR(45) NULL,
	 */

	private String skillID;

	public String getSkillID() {
		return skillID;
	}

	public void setSkillID(String skillID) {
		this.skillID = skillID;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	private String skillDescription;

}
