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

import com.demo.academicregistration.enums.Role;
import com.demo.academicregistration.model.User;
import com.demo.academicregistration.service.UserService;
import com.demo.academicregistration.util.Constants;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
		
	/**
	 * This method is used to add user which include both Student and Professor
	 * @param user
	 * @return
	 */
	@PostMapping(consumes = {"application/json"})
    public ResponseEntity<Object> addUser(@RequestBody User user) {
		logger.debug("Inside addUser method");
		if(validateUser(user)) {
			userService.addUser(user);
	        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.USER_CREATED);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).contentType(MediaType.APPLICATION_JSON).body(Constants.INVALID_USER_ROLE);
		}
    }
	
	public boolean validateUser(User user) {
		boolean isValid = false;
		if(user.getRole().equalsIgnoreCase(Role.STUDENT.toString()) || user.getRole().equalsIgnoreCase(Role.PROFESSOR.toString())) {
			isValid = true;
		}
		return isValid;
	}
}
