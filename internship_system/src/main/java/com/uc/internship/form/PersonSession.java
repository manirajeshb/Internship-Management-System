package com.uncc.internship.form;

public class PersonSession {

	private String username;
	private int access_rights;
	private boolean isStudent;
	
	
	public boolean getIsStudent() {
		return isStudent;
	}
	public void setIsStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAccess_rights() {
		return access_rights;
	}
	public void setAccess_rights(int access_rights) {
		this.access_rights = access_rights;
	}
	
}
