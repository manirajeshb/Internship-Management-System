package com.uncc.internship.model;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	private String companyId;
	private String companyName = "Anonymous";
	private String address;
	private String cell;
	private String description;
	private String industry;
	private String email;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * ``CompanyId` VARCHAR(15) NOT NULL, `CompanyName` VARCHAR(45) NULL DEFAULT
	 * 'Anonymous', `Address` VARCHAR(45) NULL, `Cell` VARCHAR(15) NULL DEFAULT
	 * NULL, `Description` VARCHAR(1000) NULL, `Industry` VARCHAR(45) NULL, `Email`
	 * VARCHAR(45) NULL,
	 */
}
