package co.com.poli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.poli.entities.Instructor;
import co.com.poli.services.InstructorService;

@RestController
@CrossOrigin 
@RequestMapping("/instructor")
public class InstructorController {



	    @Autowired
	    private InstructorService service;

	    @GetMapping
	    public List<Instructor> findAll(){
	        return service.findAll();
	    }
	    @PostMapping
	    public Instructor create(@RequestBody Instructor instructor){
	        return service.create(instructor);
	    }
	}

