package com.uncc.internship.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uncc.internship.form.PersonSession;
import com.uncc.internship.model.IntershipDetailsView;
import com.uncc.internship.model.Login;
import com.uncc.internship.model.Student;

@Component("loginDAO")
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	JdbcTemplate template;

	@Override
	public void save(Login user, PersonSession users) {
		users.setAccess_rights(user.getAccess_rights());
		users.setUsername(user.getLoginId());
		users.setIsStudent(checkStudent(user.getLoginId()));

	}

	public boolean checkStudent(String userId) {
		String sql = "select StudentID from student where StudentID='" + userId + "'";
		List<Student> student = template.query(sql, new BeanPropertyRowMapper(Student.class));
		if (student != null && !student.isEmpty()) {
			System.out.println("student");
			return true;
		} else {
			System.out.println("not student");
			return false;
		}
	}

	@Override
	public boolean checkLogin(String userName, String userPassword, PersonSession users) {

		Login user = getUserById(userName, userPassword);

		if (user != null) {
			save(user, users);
			return true;

		}
		return false;
	}

	public Login getUserById(String userName, String userPassword) {
		String sql = "select * from login where loginid = '" + userName + "' and password='" + userPassword + "'";
		List<Login> logins = template.query(sql, new BeanPropertyRowMapper(Login.class));
		if (logins != null && !logins.isEmpty()) {
			return logins.get(0);
		} else {
			return null;
		}
	}

	public List<IntershipDetailsView> internshipDetailsReport() {
		String sql = "select * from internshipdetails";
		List<IntershipDetailsView> internshipview = template.query(sql,
				new BeanPropertyRowMapper(IntershipDetailsView.class));
		return internshipview;
	}

	public List<IntershipDetailsView> internshipDetailsReport(String title) {
		String sql = "select * from internshipdetails where title ='" + title + "'";
		List<IntershipDetailsView> internshipview = template.query(sql,
				new BeanPropertyRowMapper(IntershipDetailsView.class));
		return internshipview;
	}

}
