package com.cjc.msConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@EnableDiscoveryClient
@SpringBootApplication
public class MsConsumersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsumersApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate rt() {
		RestTemplate ts= new RestTemplate();
		return ts;
	}

}
