package com.cjc.servEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServEurekaApplication {

	public static void main(String[] args) {
		System.out.println("Eureka server started");
		SpringApplication.run(ServEurekaApplication.class, args);
	}

}
