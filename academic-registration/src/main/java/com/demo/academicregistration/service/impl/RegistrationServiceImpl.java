package com.demo.academicregistration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.academicregistration.dao.RegistrationDao;
import com.demo.academicregistration.model.Registration;
import com.demo.academicregistration.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDao registrationDao;
	
	@Override
    public int register(Registration registration) {
		return registrationDao.register(registration);
    }
	
}
