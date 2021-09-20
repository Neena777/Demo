package com.demo.academicregistration.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.academicregistration.dao.RegistrationDao;
import com.demo.academicregistration.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


    @Override
    public int register(Registration registration) {
        return jdbcTemplate.update("INSERT INTO registration (user_id, course_id) VALUES (?, ?)",
                new Object[] {registration.getUserId(), registration.getCourseId()});
    }
}
