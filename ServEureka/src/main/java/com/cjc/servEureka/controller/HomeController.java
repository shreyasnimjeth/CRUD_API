package com.cjc.servEureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/openSer")
	public String ServerOpen() {
		return "Eureka server";
	}
}
