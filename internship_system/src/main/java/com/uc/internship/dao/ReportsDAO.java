package com.uncc.internship.dao;

import java.util.List;

import com.uncc.internship.model.CompanyInfoView;
import com.uncc.internship.model.FallPlacementView;

public interface ReportsDAO {
	public List<FallPlacementView> placementView();
	public List<CompanyInfoView> companiesView();
}
