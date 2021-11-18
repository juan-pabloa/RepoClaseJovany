package co.com.poli.services;

import java.util.List;

import co.com.poli.entities.Course;

public interface CoursesServices {
	
	 List<Course> findAll();
	 Course create(Course course);
}
