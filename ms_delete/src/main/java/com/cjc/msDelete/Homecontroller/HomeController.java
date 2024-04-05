package com.cjc.msDelete.Homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.msDelete.ServiceI.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteDetails(@PathVariable("id") int id) {
		si.deleteData(id);
		return "data deleted";
	}
}
