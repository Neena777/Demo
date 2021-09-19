package com.demo.academicregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.academicregistration.dao.CourseDao;
import com.demo.academicregistration.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;
	
    public int addCourse(Course course) {
		return courseDao.addCourse(course);
    }
}
