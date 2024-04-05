package com.cjc.msGet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.msGet.ServiceI.HomeService;
import com.cjc.msGet.model.Student;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@GetMapping("/getAllStudent")
	public Iterable<Student> getAllData()
	{
		Iterable<Student> al= hs.getAll();
		return al;
	}
	
	@GetMapping("/editStudentData/{id}")
	public Student editData(@PathVariable("id") int id) {
		Student s=hs.editData(id);
		return s;
	}
}
