package com.uncc.internship.model;

import java.io.Serializable;

public class IntershipDetailsView implements Serializable {


	private static final long serialVersionUID = -3465813074586302847L;

	/**
	 * CREATE OR REPLACE VIEW `internshipDetails` AS select distinct
	 * INTE.internshipID, INTE.TITLE, INTE.DESCRIPTION, skills.skillDescription,
	 * INTE.PAIDYORN, INTE.NOOFOPENINGS,CO.COMPANYNAME, CO.INDUSTRY FROM COMPANY AS
	 * CO, INTERNSHIP AS INTE, skills, internshipskill where
	 * INTE.COMPANYID=CO.COMPANYID and INTE.internshipID =
	 * internshipskill.InternshipID and internshipskill.SkillID=skills.SkillID;
	 */

	private String internshipID;
	private String description;
	private String title;
	private String skillDescription;
	private String paidOrNo;
	private Integer noOfOpenings;
	private String companyname;
	private String industry;

	public String getInternshipID() {
		return internshipID;
	}

	public void setInternshipID(String internshipID) {
		this.internshipID = internshipID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getPaidOrNo() {
		return paidOrNo;
	}

	public void setPaidOrNo(String paidOrNo) {
		this.paidOrNo = paidOrNo;
	}

	public Integer getNoOfOpenings() {
		return noOfOpenings;
	}

	public void setNoOfOpenings(Integer noOfOpenings) {
		this.noOfOpenings = noOfOpenings;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
