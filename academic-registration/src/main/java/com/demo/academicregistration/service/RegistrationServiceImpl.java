package com.demo.academicregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.academicregistration.dao.RegistrationDao;
import com.demo.academicregistration.model.Registration;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDao registrationDao;
	
    public int register(Registration registration) {
		return registrationDao.register(registration);
    }
	
}
