package com.krish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesClientsApplication.class, args);
	}

}
