package com.demo.academicregistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.academicregistration.model.User;

@Repository
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addUser(User user) {
		return jdbcTemplate.update("INSERT INTO user (first_name, last_name, role) VALUES (?, ?, ?)", 
				new Object[] {user.getFirstName(), user.getLastName(), user.getRole()});   
    }
}
