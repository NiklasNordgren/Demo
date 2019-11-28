package se.hig.exte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se.hig.exte.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer>{

	/*
	 * The Repository interface is the Spring equivalent of DAO classes.
	 */
	
	List<Exam> findByName(String name);
	
	Exam findById(int id);
}
