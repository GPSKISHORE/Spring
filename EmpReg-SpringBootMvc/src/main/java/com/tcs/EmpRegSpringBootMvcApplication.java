package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@PropertySource("classpath:com/tcs/validation/Validation.properties")
public class EmpRegSpringBootMvcApplication {

	@Bean
	public RestTemplate rt1a() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(EmpRegSpringBootMvcApplication.class, args);
	}

}
