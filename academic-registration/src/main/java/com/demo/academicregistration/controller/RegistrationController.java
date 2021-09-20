package com.demo.academicregistration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.academicregistration.model.Registration;
import com.demo.academicregistration.service.RegistrationService;
import com.demo.academicregistration.util.Constants;

@RestController
@RequestMapping(path = "/register")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	/**
	 * This method helps to assign course to the user which includes both Student and Professor
	 * @param registration
	 * @return
	 */
	@PostMapping(consumes = { "application/json" })
	public ResponseEntity<Object> register(@RequestBody Registration registration) {
		logger.debug("Inside register method");
		registrationService.register(registration);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.REGISTRATION_COMPLETED);
	}

}
