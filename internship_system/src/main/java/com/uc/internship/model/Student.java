package com.uncc.internship.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * `StudentID` VARCHAR(15) NOT NULL, `Semester` VARCHAR(45) NULL, `Major`
	 * VARCHAR(45) NULL, `Minor` VARCHAR(45) NULL, `GraduationYear` YEAR NULL,
	 * `EnrollmentYear` YEAR NULL, `GPA` DECIMAL NULL,
	 */
	private String studentID;
	private String semester;
	private String major;
	private String minor;
	private Date graduationYear;
	private Date enrollmentYear;
	private Float gpa;

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public Date getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Date graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Date getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(Date enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}
}
