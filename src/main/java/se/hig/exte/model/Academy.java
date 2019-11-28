package se.hig.exte.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
  This is a model class representing an Academy at University of Gefle.
 * It contains a unique id, a name and a list of subjects.
 * @author Hanna Meden
 * @version 2019-11-28
 */
@Entity
public class Academy {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private ArrayList<Subject> subjects;
	
	// Only used for JPA/Spring, which is why it is declared with protected.
	protected Academy() {}
	
	public Academy(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

}
