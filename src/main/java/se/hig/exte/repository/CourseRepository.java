package se.hig.exte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se.hig.exte.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	/*
	 * The Repository interface is the Spring equivalent of DAO classes.
	 */
	
	List<Course> findByName(String name);
	
	Course findById(int id);
	
		
	
	
}
