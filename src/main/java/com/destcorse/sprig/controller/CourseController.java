package com.destcorse.sprig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.destcorse.sprig.model.Course;
import com.destcorse.sprig.repository.CourseRepository;


@RestController
public class CourseController {
	@Autowired
    private CourseRepository  courseRepository;

   
    @GetMapping("/Corse")
    public List<Course> getAllCorse() {
        return courseRepository.findAll();
    }
    @GetMapping("/Corse/{id}")
    public Course getCorse(@PathVariable Long id) {
        return courseRepository.findOne(id);
    }
   

    @PostMapping("/Corse")
    public Course createCorse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @PutMapping("/Corse/{id}")
    public Course updatePost(@PathVariable Long courseId , @RequestBody Course courseRequest) {
        @SuppressWarnings("unused")
		Course c = courseRepository.findOne(courseId);
    	return courseRepository.save(courseId);
    	
    }


    @DeleteMapping("/Corse/{id}")
    public void deletePost(@PathVariable Long courseId) {
       
         courseRepository.delete(courseId);

    }}

