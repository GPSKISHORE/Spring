package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:com/tcs/validation/Validation.properties")
public class EmpRegSpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpRegSpringBootMvcApplication.class, args);
	}

}
