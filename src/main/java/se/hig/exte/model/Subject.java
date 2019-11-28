package se.hig.exte.model;

import java.util.ArrayList;

/**
 * This is a model class representing a Subject at University of Gefle.
 * It contains a unique id, a name and a list of courses. 
 * @author Hanna
 *
 */
public class Subject {
	private Long id;
	private String name;
	private ArrayList<Course> courses;
	
	public Subject(String name){
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	
}
