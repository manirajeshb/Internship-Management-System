package com.uncc.internship.model;

import java.io.Serializable;

/**
 * 
 * @author prek7
 *
 */
public class Administrator implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `AdminID` VARCHAR(15) NOT NULL, `Shift` VARCHAR(45) NULL,
	 */
	private String adminID;
	private String shift;

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

}
