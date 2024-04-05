package com.cjc.msCreate.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.msCreate.ServiceI.HomeService;
import com.cjc.msCreate.model.student;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/saveData")
	public String SaveData(@RequestBody student s) {
		hs.saveData(s);
		return "data saved";
	}
}
