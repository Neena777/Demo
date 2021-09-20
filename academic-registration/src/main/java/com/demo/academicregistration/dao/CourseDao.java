package com.demo.academicregistration.dao;

import com.demo.academicregistration.model.Course;

public interface CourseDao {
	/**
	 * Add the Course Details objects to Database.
	 * @param course
	 * @return int
	 */
	int addCourse(Course course);
	/**
	 * Update the Course Details exiting object.
	 * @param course
	 * @return int
	 */
	int updateCourse(Course course);
	/**
	 * Delete the Course Object.
	 * @param course
	 * @return int
	 */
	int deleteCourse(int course);
	/**
	 * Retrieve the Course Object based on Id.
	 * @param courseId
	 * @return Course
	 */
	Course getCourse(int courseId);
}
