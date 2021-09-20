package com.demo.academicregistration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	 * @param course object to add
	 * @return ResponseEntity with appropriate status code and body
	 */
	@PostMapping
    public ResponseEntity<Object> addCourse(@RequestBody Course course) {
		logger.debug("Inside addCourse method");
		courseService.addCourse(course);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.COURSE_CREATED);
    }
	
	/**
     * This method is to update course details
     *
     * @param course object to add
     * @return ResponseEntity with appropriate status code and body
     */
    @PutMapping
    public ResponseEntity<Object> updateCourse(@RequestBody Course course) {
    	logger.debug("Inside updateCourse method");
        courseService.updateCourse(course);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.COURSE_UPDATED);
    }

    /**
     * This method is to delete a course for a id.
     *
     * @param courseId object to add
     * @return ResponseEntity with appropriate status code and body
     */
    @DeleteMapping(path = "/{courseId}")
    public ResponseEntity<Object> deleteCourse(@PathVariable int courseId) {
        logger.debug("Inside deleteCourse method");
        courseService.deleteCourse(courseId);
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(Constants.COURSE_DELETED);
    }

    /**
     * This method is to retrieve the course details for a course.
     *
     * @param courseId id of the course
     * @return ResponseEntity with appropriate status code and Course Object
     */
    @GetMapping(path = "/{courseId}")
    public ResponseEntity<Object> getCourse(@PathVariable int courseId) {
    	logger.debug("Inside getCourse method");
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON).body(courseService.getCourse(courseId));
    }

}
