package com.cjc.msConsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.msConsumer.model.student;
@CrossOrigin
@RestController
public class HomeController {
	
	@Autowired
	RestTemplate rs;
	
	@PostMapping("/postCons")
	public String postData(@RequestBody student s) {
		//String url="http://laptop-8alu92ns.mshome.net:1111/saveData";
		String url="http://zuul/savedata/saveData";
		String msg=rs.postForObject(url, s, String.class);
		return msg;
	}
	
	@GetMapping("/getCons")
	public List getData() {
		//String url="http://laptop-8alu92ns.mshome.net:2222/getAllStudent";
		String url="http://zuul/getdata/getAllStudent";
		List msg=rs.getForObject(url, List.class);
		return msg;
	}
	
	@GetMapping("/editData/{id}")
	public student editData(@PathVariable("id") int id) {
		String url="http://zuul/getdata/editStudentData";
		student msg=rs.getForObject(url, student.class);
		return msg;
	}
	
	@PutMapping("/putCons/{id}")
	public student updateData(@RequestBody student s, @PathVariable("id") int id) {
		//String url="http://laptop-8alu92ns.mshome.net:3333/updateStudent/"+roll;
		String url="http://zuul/updatedata/updateStudent/"+id;
		rs.put(url, s);
		return s;
	}
	
	@DeleteMapping("/deleteCons/{id}")
	public String deleteData(@PathVariable("id") int id) {
		//String url="http://laptop-8alu92ns.mshome.net:4444/deleteStudent/"+id;
		String url="http://zuul/deletedata/deleteStudent/"+id;
		rs.delete(url);
		return "data deleted";
	}

}
