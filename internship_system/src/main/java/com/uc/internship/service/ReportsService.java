package com.uncc.internship.service;

import java.util.List;

import com.uncc.internship.model.CompanyInfoView;
import com.uncc.internship.model.FallPlacementView;

public interface ReportsService {
	public List<FallPlacementView> placementView();
	public List<CompanyInfoView> companiesView();
}
