package com.demo.academicregistration.dao;

import com.demo.academicregistration.model.Registration;

public interface RegistrationDao {
	
	/**
	 * Register the course for both Students and Professors
	 * @param registration
	 * @return int
	 */
	int register(Registration registration);
}
