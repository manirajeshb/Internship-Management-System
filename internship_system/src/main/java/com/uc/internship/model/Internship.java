package com.uncc.internship.model;

import java.io.Serializable;
import java.util.Date;


public class Internship implements Serializable {
	/*
	 * `InternshipId` VARCHAR(15) NOT NULL, `StartDate` DATE NOT NULL, `EndDate`
	 * DATE NOT NULL, `Location` VARCHAR(20) NULL DEFAULT 'Not Decided',
	 * `Description` VARCHAR(1000) NULL DEFAULT NULL, `HoursPerWeek` INT(11) NOT
	 * NULL, `NoOfOpenings` INT(11) NOT NULL, `Title` VARCHAR(45) NOT NULL,
	 * `PaidYorN` VARCHAR(15) NOT NULL, `CompanyID` VARCHAR(15) NOT NULL,
	 */

	private static final long serialVersionUID = -3465813074586302847L;
	 
	private String internshipId;
    private Date startDate;
    private Date endDate;
    private String location;
	private String description;
    private Integer hoursPerWeek;
    private Integer noOfOpenings;
    private String title;
    private String paidYorN;
    private String companyID;
    public String getInternshipId() {
		return internshipId;
	}
	public void setInternshipId(String internshipId) {
		this.internshipId = internshipId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(Integer hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
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
	public String getPaidYorN() {
		return paidYorN;
	}
	public void setPaidYorN(String paidYorN) {
		this.paidYorN = paidYorN;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	
	
   
}
