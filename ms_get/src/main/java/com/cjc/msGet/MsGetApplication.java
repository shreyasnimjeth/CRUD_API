package com.cjc.msGet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsGetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGetApplication.class, args);
	}

}
