package se.hig.exte.model;

import java.util.ArrayList;

/**
 * This is a model class representing a Course at 
 * University of Gefle. It contains of an id, a name and
 *  a unique coursecode.
 * 
 */
public class Course {
	private Long id;
	private String code;
	private String name; 
	private ArrayList<Exam> exams; 
	
	
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
