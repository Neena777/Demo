package com.demo.academicregistration.model;

import javax.validation.constraints.NotEmpty;

/**
 * The course registration model for courses
 */
public class Registration {

	private int regId;
	
	@NotEmpty
	private String userId;
	
	@NotEmpty
	private String courseId;

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
