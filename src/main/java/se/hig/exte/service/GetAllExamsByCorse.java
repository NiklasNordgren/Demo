package se.hig.exte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.hig.exte.repository.ExamRepository;

@Service
public class GetAllExamsByCorse {
	private final ExamRepository examRepository;
	
	@Autowired
	public GetAllExamsByCorse(ExamRepository examRepository) {
		this.examRepository = examRepository;
	}
	
	public void execute() {
		
	}
}
