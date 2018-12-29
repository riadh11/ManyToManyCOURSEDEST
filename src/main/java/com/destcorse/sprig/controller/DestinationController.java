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
import com.destcorse.sprig.model.Destination;
import com.destcorse.sprig.repository.CourseRepository;
import com.destcorse.sprig.repository.DestinationRepository;


@RestController
public class DestinationController {
	@Autowired
    private CourseRepository  courseRepository;

    @Autowired
    private DestinationRepository destinationRepository;
    @GetMapping("/Dest")
    public List<Destination> getAllDest() {
        return destinationRepository.findAll();
    }
    @GetMapping("/dest/{id}")
    public Destination getDest(@PathVariable Long id) {
        return destinationRepository.findOne(id);
    }
   

    @PostMapping("/dest")
    public Destination createDest(@RequestBody Long destination) {
        return destinationRepository.save(destination);
    }

    @PutMapping("/dest/{id}")
    public Course updatePost(@PathVariable Long destinationId , @RequestBody Course destinationRequest) {
        @SuppressWarnings("unused")
		Course c = courseRepository.findOne(destinationId);
    	return courseRepository.save(destinationId);
    	
    }


    @DeleteMapping("/dest/{id}")
    public void deletePost(@PathVariable Long destinationId) {
       
         courseRepository.delete(destinationId);

    }}

