package com.uncc.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uncc.internship.dao.LoginDAO;
import com.uncc.internship.dao.ReportsDAO;
import com.uncc.internship.model.CompanyInfoView;
import com.uncc.internship.model.FallPlacementView;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {
	@Autowired
	private ReportsDAO reportsDAO;

	@Transactional
	public void setReportsDAO(ReportsDAO reportsDAO) {
		this.reportsDAO = reportsDAO;
	}

	@Transactional
	public List<FallPlacementView> placementView() {

		return reportsDAO.placementView();
	}

	@Transactional
	public List<CompanyInfoView> companiesView() {
		return reportsDAO.companiesView();
	}

}
