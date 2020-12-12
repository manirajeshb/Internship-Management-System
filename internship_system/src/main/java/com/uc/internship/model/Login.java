package com.uncc.internship.model;

import java.io.Serializable;

public class Login implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;
	/*
	 * `loginId` VARCHAR(35) NOT NULL, `password` VARCHAR(45) NOT NULL,
	 * `security_question` int NOT NULL, `security_answer` VARCHAR(45) NOT NULL,
	 * `access_rights` int NOT NULL,
	 */

	private String loginId;

	private String password;

	private String security_Answer;

	private int security_Question;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurity_Answer() {
		return security_Answer;
	}

	public void setSecurity_Answer(String security_Answer) {
		this.security_Answer = security_Answer;
	}

	public int getSecurity_Question() {
		return security_Question;
	}

	public void setSecurity_Question(int security_Question) {
		this.security_Question = security_Question;
	}

	public int getAccess_rights() {
		return access_rights;
	}

	public void setAccess_rights(int access_rights) {
		this.access_rights = access_rights;
	}

	private int access_rights;

}
