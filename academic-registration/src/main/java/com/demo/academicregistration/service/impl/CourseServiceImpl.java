package com.demo.academicregistration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.academicregistration.dao.CourseDao;
import com.demo.academicregistration.model.Course;
import com.demo.academicregistration.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;
    
    @Override
	public int addCourse(Course course) {
		return courseDao.addCourse(course);
    }

	@Override
	public int updateCourse(Course course) {
		return courseDao.updateCourse(course);
	}

	@Override
	public int deleteCourse(int courseId) {
		return courseDao.deleteCourse(courseId);
	}

	@Override
	public Course getCourse(int courseId) {
		return courseDao.getCourse(courseId);
	}
}
