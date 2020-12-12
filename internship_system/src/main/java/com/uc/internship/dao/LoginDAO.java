package com.uncc.internship.dao;

import java.util.List;

import com.uncc.internship.form.PersonSession;
import com.uncc.internship.model.IntershipDetailsView;
import com.uncc.internship.model.Login;

public interface LoginDAO {
	public boolean checkLogin(String userName, String userPassword,PersonSession user);
	 void save(Login user,PersonSession users);
	 public List<IntershipDetailsView> internshipDetailsReport();
	 public List<IntershipDetailsView> internshipDetailsReport(String searchValue);
}
