package com.demo.academicregistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.academicregistration.model.Course;

@Repository
public class CourseDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addCourse(Course course) {
		return jdbcTemplate.update("INSERT INTO course (course_name, course_year) VALUES (?, ?)", 
				new Object[] {course.getCourseName(), course.getCourseYear()});   
    }
}
