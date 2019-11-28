package se.hig.exte.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.hig.exte.model.Exam;
import se.hig.exte.service.AddExamService;

@RestController
public class ExamController {

	
	private final AddExamService addExamService;

	@Autowired
	public ExamController(AddExamService addExamService) {
		this.addExamService = addExamService;
	}
	
	@RequestMapping("/index")
    public ResponseEntity<String> index() {
		return ResponseEntity.status(HttpStatus.OK).body("Welcome!");
    }
	
	@PostMapping()
	public void create(@RequestBody Map<String, String> body) {
		LocalDate date = LocalDate.parse(body.get("date"));
		String name = body.get("name");
		try {
			URL url = new URL(body.get("pdfUrl"));
			Exam exam = new Exam(name, date, url);
			addExamService.execute(exam);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
