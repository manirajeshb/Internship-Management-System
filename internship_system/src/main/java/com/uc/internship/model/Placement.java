package com.uncc.internship.model;

import java.io.Serializable;

public class Placement implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `PlacementID` VARCHAR(15) NOT NULL, `SupervisorID` VARCHAR(15) NOT NULL
	 * DEFAULT 'ToAssign', `Notes` VARCHAR(45) NULL,
	 */
	private String placementID;
	private String supervisorID;
	private String notes;

	public String getPlacementID() {
		return placementID;
	}

	public void setPlacementID(String placementID) {
		this.placementID = placementID;
	}

	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
