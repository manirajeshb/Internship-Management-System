package com.uncc.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uncc.internship.dao.LoginDAO;
import com.uncc.internship.form.PersonSession;
import com.uncc.internship.model.IntershipDetailsView;
import com.uncc.internship.model.Login;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;

	@Transactional
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Transactional
	public boolean checkLogin(String userName, String userPassword, PersonSession user) {
		System.out.println("In Service class...Check Login");

		return loginDAO.checkLogin(userName, userPassword, user);
	}

	@Transactional
	public List<IntershipDetailsView> internshipDetailsReport() {
		System.out.println("In Service class...Check Login");
		return loginDAO.internshipDetailsReport();
	}

	@Transactional
	public List<IntershipDetailsView> internshipDetailsReport(String searchValue) {
		System.out.println("In Service class...Check Login");
		return loginDAO.internshipDetailsReport(searchValue);
	}
}
