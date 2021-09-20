package com.demo.academicregistration.dao;

import com.demo.academicregistration.model.User;

public interface UserDao {
	/**
	 * Register both students and professors
	 * @param user
	 * @return int
	 */
	int addUser(User user);
}
