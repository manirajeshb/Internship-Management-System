package com.uncc.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uncc.internship.dao.ApplicationDAO;
import com.uncc.internship.dao.LoginDAO;
import com.uncc.internship.form.PaperworkForm;
import com.uncc.internship.model.Application;

@Service("applicationService")
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationDAO applicationDAO;

	@Transactional
	public void setApplicationDAO(ApplicationDAO applicationDAO) {
		this.applicationDAO = applicationDAO;
	}

	@Transactional
	public boolean applyForInternship(String studentID, String internshipID) {
		return applicationDAO.applyForInternship(studentID, internshipID);

	}

	@Transactional
	public List<Application> pending() {
		return applicationDAO.pending();
	}

	@Transactional
	public boolean editApplication(String status, String applicationID) {
		return applicationDAO.editApplication(status, applicationID);
	}

	@Transactional
	public boolean paperworkApplication(PaperworkForm paperworkForm) {
		return applicationDAO.paperworkApplication(paperworkForm);
	}
}
