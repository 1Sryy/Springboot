package com.Spring.H2DB.SpringBootWithH2DB.Controller;
import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.H2DB.SpringBootWithH2DB.Repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository repository;
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return repository.save(student);
				
	}
	
	@GetMapping
	public List getAllStudent(){
		return repository.findAll();
	}
}


public class StudentController {

}
