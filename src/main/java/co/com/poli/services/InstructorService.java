package co.com.poli.services;

import java.util.List;

import co.com.poli.entities.Instructor;

public interface InstructorService {

	List<Instructor> findAll();
    Instructor create(Instructor instructor);
}


