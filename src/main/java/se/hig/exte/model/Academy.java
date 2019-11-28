package se.hig.exte.model;

import java.util.ArrayList;

/**
  This is a model class representing an Academy at University of Gefle.
 * It contains a unique id, a name and a list of subjects.
 * @author Hanna
 *
 */

public class Academy {
	private Long id;
	private String name;
	private ArrayList<Subject> subjects;
	
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
