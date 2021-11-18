package co.com.poli.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.poli.entities.Course;
import co.com.poli.repository.CourseRepository;

@Service
public class CoursesServicesImpl implements CoursesServices{
	
	@Autowired
	private CourseRepository repository;

	@Override
	public List<Course> findAll() {
		return repository.findAll();
	}

	@Override
	public Course create(Course course) {
		return repository.save(course);
	}

}
