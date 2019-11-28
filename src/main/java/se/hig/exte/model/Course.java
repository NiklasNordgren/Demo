package se.hig.exte.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is a model class representing a Course at 
 * University of Gefle. It contains of an id, a name and
 *  a unique coursecode.
 *  @author Hanna Meden
 *  @version 2019-11-28
 * 
 */
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String code;
	private String name; 
	private ArrayList<Exam> exams; 
	
	// Only used for JPA/Spring, which is why it is declared with protected.
	protected Course() {}
	
	public Course(String code, String name) {
		this.code = code;
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public String getCode() {
		return code;
	}


	public String getName() {
		return name;
	}

	public ArrayList<Exam> getExams(){
		return exams;
	}
}
