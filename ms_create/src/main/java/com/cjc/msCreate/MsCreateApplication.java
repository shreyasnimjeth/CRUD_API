package com.cjc.msCreate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsCreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreateApplication.class, args);
	}

}
