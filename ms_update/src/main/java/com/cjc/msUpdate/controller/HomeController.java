package com.cjc.msUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.msUpdate.ServiceI.ServiceI;
import com.cjc.msUpdate.model.Student;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@PutMapping("/updateStudent/{id}")
	public String updateDetails(@RequestBody Student s, @PathVariable("id") int id) {
		if(s.getId()==id) {
			si.updateData(s);
			return "details updated";
		}
		return "Wrong roll no.";
	}
}
