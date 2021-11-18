package co.com.poli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.poli.entities.Course;
import co.com.poli.services.CoursesServices;

@RestController
@RequestMapping("/course")
public class CoursesController {


	    @Autowired
	    private CoursesServices service;

	    @GetMapping
	    public List<Course> findAll(){
	        return service.findAll();
	    }
	    @PostMapping
	    public Course create(@RequestBody Course course){
	        return service.create(course);
	    }

}
