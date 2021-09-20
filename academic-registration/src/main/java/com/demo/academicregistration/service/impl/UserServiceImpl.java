package com.demo.academicregistration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.academicregistration.dao.UserDao;
import com.demo.academicregistration.model.User;
import com.demo.academicregistration.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
    public int addUser(User user) {
		return userDao.addUser(user);
    }
}
