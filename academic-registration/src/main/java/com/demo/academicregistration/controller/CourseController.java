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

import com.demo.academicregistration.model.Course;
import com.demo.academicregistration.service.CourseService;
import com.demo.academicregistration.util.Constants;

@RestController
@RequestMapping(path = "/course")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
	
	/**
	 * This method is to add course
	 * @param course
	 * @return
	 */
	@PostMapping(consumes = {"application/json"})
    public ResponseEntity addCourse(@RequestBody Course course) {
		logger.info("Inside addCourse method");
    	courseService.addCourse(course);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.COURSE_CREATED);
    }

}
