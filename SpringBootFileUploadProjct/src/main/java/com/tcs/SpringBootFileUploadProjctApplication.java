package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@SpringBootApplication
public class SpringBootFileUploadProjctApplication {

	@Bean(name = "multipartResolver")
	StandardServletMultipartResolver MultiPartfile() {
		return new StandardServletMultipartResolver();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileUploadProjctApplication.class, args);
	}

}
