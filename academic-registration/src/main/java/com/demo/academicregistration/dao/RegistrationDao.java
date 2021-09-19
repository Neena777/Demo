package com.demo.academicregistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.academicregistration.model.Registration;

@Repository
public class RegistrationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int register(Registration registration) {
		return jdbcTemplate.update("INSERT INTO registration (user_id, course_id) SELECT user.id,"
				+ "course.id FROM user, course WHERE user.first_name=? AND course.course_name=?",
				new Object[] {registration.getUserName(), registration.getCourseName()});   
    }
}
