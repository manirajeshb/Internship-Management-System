package com.uncc.internship.service;

import java.util.List;

import com.uncc.internship.form.PaperworkForm;
import com.uncc.internship.model.Application;

public interface ApplicationService {
	public boolean applyForInternship(String studentID, String internshipID);
	public List<Application> pending();
	 public boolean editApplication(String status, String applicationID);
	 public boolean paperworkApplication(PaperworkForm paperworkForm); 
}
