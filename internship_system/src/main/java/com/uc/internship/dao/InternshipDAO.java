package com.uncc.internship.dao;

import java.util.List;

public interface InternshipDAO {
	public StringBuilder getIntershipDetails(String internshipID); 
	
	public StringBuilder getCompaniesIntershipOffer(String companyId); 
	
	}
