package com.demo.academicregistration.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.academicregistration.dao.CourseDao;
import com.demo.academicregistration.model.Course;

@Repository
public class CourseDaoImpl implements CourseDao {
	@Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addCourse(Course course) {
        return jdbcTemplate.update("INSERT INTO course (course_name, course_year) VALUES (?, ?)",
                new Object[]{course.getCourseName(), course.getCourseYear()});
    }

    @Override
    public Course getCourse(int courseId) {
        return (Course) jdbcTemplate.queryForObject("SELECT course_id, course_name, course_year from course where course_id = ?",
        		new BeanPropertyRowMapper(Course.class), courseId);
    }

    @Override
    public int deleteCourse(int courseId) {
        return jdbcTemplate.update("DELETE FROM course where course_id = ?", new Object[] {courseId});
    }

    @Override
    public int updateCourse(Course course) {
        Course currentCourse = getCourse(course.getCourseId());
        if (course.getCourseYear() == 0) {
            course.setCourseYear(currentCourse.getCourseYear());
        }
        if (course.getCourseName() == null) {
            course.setCourseName(currentCourse.getCourseName());
        }
        return jdbcTemplate.update("UPDATE course SET course_name = ?, course_year=? WHERE course_id = ?",
                new Object[] {course.getCourseName(), course.getCourseYear(), course.getCourseId()});
    }
}
