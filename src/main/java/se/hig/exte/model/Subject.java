package se.hig.exte.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is a model class representing a Subject at University of Gefle.
 * It contains a unique id, a name and a list of courses. 
 * @author Hanna Meden
 * @version 2019-11-28
 *
 */
@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private ArrayList<Course> courses;
	
	// Only used for JPA/Spring, which is why it is declared with protected.
	protected Subject() {}
	
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
