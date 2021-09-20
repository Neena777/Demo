package com.demo.academicregistration.model;

import javax.validation.constraints.NotEmpty;

/**
 * The course model which houses the course attributes
 */
public class Course {
	
	private int courseId;
    
	@NotEmpty
	private String courseName;
    
	@NotEmpty
    private int courseYear;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
