package com.uncc.internship.model;

import java.io.Serializable;

public class CompanyInfoView implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * CREATE OR REPLACE VIEW `CompanyInfo` AS SELECT c.companyid, c.companyname,
	 * c.address, c.cell, c.description,c.email, industry, i.title, internshipid,
	 * noofopenings FROM company c
	 */

	private String companyId;
	private String companyName;
	private String address;
	private String cell;
	private String description;
	private String industry;
	private String email;
	private Integer noOfOpenings;
	private String title;
	private String internshipId;

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

	public Integer getNoOfOpenings() {
		return noOfOpenings;
	}

	public void setNoOfOpenings(Integer noOfOpenings) {
		this.noOfOpenings = noOfOpenings;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInternshipId() {
		return internshipId;
	}

	public void setInternshipId(String internshipId) {
		this.internshipId = internshipId;
	}
}
