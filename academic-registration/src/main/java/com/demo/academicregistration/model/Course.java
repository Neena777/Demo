package com.demo.academicregistration.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private int id;
    
	@NotEmpty
	private String courseName;
    
	@NotEmpty
    private int courseYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseYear() {
		return courseYear;
	}

	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}
}
