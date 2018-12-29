package com.destcorse.sprig.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.destcorse.sprig.model.Course;
import com.destcorse.sprig.model.Destination;

public interface CourseRepository extends JpaRepository < Course , Long>  {

	Course save(Long courseId);

}
