package com.krish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesClientServiceApplication {

	public static void main(String[] args) {
		System.out.println("//////////////////////////////");
		SpringApplication.run(MicroServicesClientServiceApplication.class, args);
	}

}
