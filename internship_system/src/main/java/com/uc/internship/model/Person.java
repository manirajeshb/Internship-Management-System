package com.uncc.internship.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	/**
	 * `ID` VARCHAR(15) NOT NULL, `name` VARCHAR(45) NULL DEFAULT NULL, `cell`
	 * VARCHAR(15) NULL DEFAULT NULL, `email` VARCHAR(45) NULL DEFAULT NULL,
	 * `address` VARCHAR(45) NULL DEFAULT NULL, `SSN` VARCHAR(15) NULL DEFAULT NULL,
	 * `loginid` VARCHAR(45) NULL DEFAULT NULL,
	 */

	private String id;
	private String name;
	private String cell;
	private String email;
	private String address;
	private String ssn;
	private String loginId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
}
