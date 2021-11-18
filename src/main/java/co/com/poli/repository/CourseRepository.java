package co.com.poli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.poli.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
