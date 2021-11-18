package co.com.poli.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.poli.entities.Instructor;
import co.com.poli.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	 @Autowired
	    private InstructorRepository repository;

	    @Override
	    public List<Instructor>findAll() {
	        return repository.findAll();
	    }
	   


		@Override
		  public Instructor create(Instructor instructor) {
	        return repository.save(instructor);
	    }

}
