package com.uncc.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uncc.internship.dao.InternshipDAO;
import com.uncc.internship.dao.LoginDAO;

@Service("internshipService")
public class InternshipServiceImpl implements InternshipService {

	@Autowired
	private InternshipDAO internshipDAO;

	@Transactional
	public void setInternshipDAO(InternshipDAO internshipDAO) {
		this.internshipDAO = internshipDAO;
	}

	@Transactional
	public StringBuilder getCompaniesIntershipOffer(String companyId) {
		System.out.println("In Service class...Check Login");
		return internshipDAO.getCompaniesIntershipOffer(companyId);
	}

	@Transactional
	public StringBuilder getIntershipDetails(String internshipID) {
		System.out.println("In Service class...Check Login");
		return internshipDAO.getIntershipDetails(internshipID);
	}

}
