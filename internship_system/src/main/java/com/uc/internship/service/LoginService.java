package com.uncc.internship.service;

import java.util.List;

import com.uncc.internship.form.PersonSession;
import com.uncc.internship.model.IntershipDetailsView;

public interface LoginService {
	public boolean checkLogin(String userName, String userPassword, PersonSession user);
	public List<IntershipDetailsView> internshipDetailsReport();
	 public List<IntershipDetailsView> internshipDetailsReport(String searchValue);
}
