package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.Faculty;
import klu.model.FacultyManager;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	FacultyManager FM;
	
	@PostMapping("/save")
	public String saveFaculty(@RequestBody Faculty F)
	{
		return FM.addFaculty(F);
	}
}
