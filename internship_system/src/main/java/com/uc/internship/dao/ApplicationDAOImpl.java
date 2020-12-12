package com.uncc.internship.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;

import com.uncc.internship.form.PaperworkForm;
import com.uncc.internship.model.Application;

@Component("applicationDAO")
public class ApplicationDAOImpl implements ApplicationDAO {

	@Autowired
	JdbcTemplate template;

	@Override
	public boolean applyForInternship(String studentID, String internshipID) {
		try {
			template.update(new PreparedStatementCreator() {

				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					String sql = "insert into application (hireorNot,studentid,internshipid) values(?,?,?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setInt(1, 12);
					stmt.setString(2, studentID);
					stmt.setString(3, internshipID);

					return stmt;
				}
			});
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	@Override
	public List<Application> pending() {
		String sql = "select * from application where HireOrNot=(select enumId from enum where content='pending')";
		List<Application> pendingApps = template.query(sql, new BeanPropertyRowMapper(Application.class));
		return pendingApps;
	}

	@Override
	public boolean editApplication(String status, String applicationID) {
		String sql = "update application set HireOrNot=(select enumId from enum where content='" + status
				+ "') where ApplicationID='" + applicationID + "'";
		return template.update(sql) == 0 ? false : true;
	}

	@Override
	public boolean paperworkApplication(PaperworkForm paperworkForm) {
		try {
			String place = "update placement set notes='" + paperworkForm.getNotes() + "' , supervisorevaluation='"
					+ paperworkForm.getSupervisorEvaluation()
					+ "',SupervisorID=(select SupervisorID from supervisor where supervisor.Email='"
					+ paperworkForm.getSupervisorEmail() + "') where placementId='" + paperworkForm.getPlacementID()
					+ "'";
			String paper = "update paperwork set supervisorEvaluation='" + paperworkForm.getSupervisorEvaluation()
					+ "',companyInfo='" + paperworkForm.getCompanyInfo() + "',StudentInfo='"
					+ paperworkForm.getStudentInfo() + "' where placementId='" + paperworkForm.getPlacementID() + "'";
			template.update(place);
			template.update(paper);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
