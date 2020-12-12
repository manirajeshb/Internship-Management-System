package com.uncc.internship.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uncc.internship.model.CompanyInfoView;
import com.uncc.internship.model.Internship;
import com.uncc.internship.model.Login;
import com.uncc.internship.model.PaidIntern;
import com.uncc.internship.model.Skills;
import com.uncc.internship.model.UnpaidIntern;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

@Component("internshipDAO")
public class InternshipDAOImpl implements InternshipDAO {
	@Autowired
	JdbcTemplate template;

	@Override
	public StringBuilder getIntershipDetails(String internshipID) {

		String sql = "SELECT * FROM internship LEFT JOIN (company)"
				+ " ON (company.CompanyId=internship.CompanyID) where internship.internshipId ='" + internshipID
				+ "'";
		return getDetails(sql);
	}

	@Override
	public StringBuilder getCompaniesIntershipOffer(String companyId) {
		String sql = "SELECT * FROM internship LEFT JOIN (company)" + " ON (company.CompanyId=internship.CompanyID)"
				+ " where internship.companyid = '" + companyId + "'";

		return getDetails(sql);
	}

	public StringBuilder getDetails(String sql) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		SqlRowSet rowSet = template.queryForRowSet(sql, paramSource);
		StringBuilder result = new StringBuilder();
		String internshipID = null, paid = null;
		while (rowSet.next()) {
			/**
			 * private String companyName = "Anonymous"; private String address; private
			 * String cell; private String description; private String industry; private
			 * String email;
			 */
			internshipID = rowSet.getString("internshipID");
			paid = rowSet.getString("paidYorN");
			result.append("Start Date :" + rowSet.getObject("startDate"));
			result.append("\nEnd Date :" + rowSet.getObject("endDate"));
			result.append("\nLocation :" + rowSet.getObject("location"));
			result.append("\nDescription :" + rowSet.getObject("description"));
			result.append("\nHours Per Week :" + rowSet.getObject("hoursPerWeek"));
			result.append("\nNo Of Openings :" + rowSet.getObject("noOfOpenings"));
			result.append("\nTitle :" + rowSet.getObject("title"));
			result.append("\nCompany Name :" + rowSet.getObject("companyName"));
			result.append("\nAddress :" + rowSet.getObject("address"));
			result.append("\nCell :" + rowSet.getObject("cell"));
			result.append("\nDescription :" + rowSet.getObject("description"));
			result.append("\nIndustry :" + rowSet.getObject("industry"));
			result.append("\nEmail :" + rowSet.getObject("email"));
		}
		String details = null;
		if (paid.equalsIgnoreCase("Y")) {
			details = "SELECT * FROM paidintern where paidintern.InternshipID ='" + internshipID + "'";
			List<PaidIntern> paidIntern = template.query(details, new BeanPropertyRowMapper(PaidIntern.class));
			if(paidIntern!=null && !paidIntern.isEmpty()) {
			result.append("\nWork Type :"+paidIntern.get(0).getWorkType());
			result.append("\nTotal Salary :" +paidIntern.get(0).getTotalSalary());
			}
		} else {
			details = "SELECT * FROM unpaidintern where unpaidintern.InternshipID ='" + internshipID + "'";
			List<UnpaidIntern> unPaidIntern = template.query(details, new BeanPropertyRowMapper(UnpaidIntern.class));
			if (unPaidIntern!=null && !unPaidIntern.isEmpty()) {
			result.append("\nAcademic Credit :"+unPaidIntern.get(0).getAcademicCredit());
			}
		}
		String skills = "select skills.SkillDescription from skills,internshipskill where"
				+ "skills.SkillID=internshipskill.SkillID and internshipskill.InternshipID='" + internshipID + "'";
		List<Skills> skillsList = template.query(skills, new BeanPropertyRowMapper(Skills.class));
		result.append("\nSkills :");
		for (Skills skill : skillsList) {
			result.append(skill.getSkillDescription());
			result.append(" ");

		}
		return result;
	}
}
