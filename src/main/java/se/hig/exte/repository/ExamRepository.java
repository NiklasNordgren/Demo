package se.hig.exte.repository;

import java.util.List;

import se.hig.exte.model.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Long>{

	/*
	 * The Repository interface is the Spring equivalent of DAO classes.
	 */
	
	List<Exam> findByName(String name);
	
	Exam findById(long id);
}
