package com.uncc.internship.model;

import java.io.Serializable;
import java.util.Date;

public class StudentInfoView implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/**
	 * CREATE OR REPLACE VIEW `StudentInfo` AS SELECT s.studentID, p.Name, p.cell,
	 * p.email, p.address, p.ssn, s.Semester, s.Major, s.Minor, s.GraduationYear,
	 * s.EnrollmentYear, s.GPA FROM person p RIGHT JOIN student s on
	 * p.ID=s.studentID;
	 */
	private String studentID;
	private String semester;
	private String major;
	private String minor;
	private Date graduationYear;
	private Date enrollmentYear;
	private Float gpa;
	private String name;
	private String cell;
	private String email;
	private String address;
	private String ssn;

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

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
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
}
