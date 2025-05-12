package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringBootFileUploadProjctApplication {

	@Bean(name = "multipartResolver")
	StandardServletMultipartResolver MultiPartfile() {
		return new StandardServletMultipartResolver();
	}
	
	@Bean
	ViewResolver jspPagsPath() {
		System.out.println("SpringBootFileUploadProjctApplication.jspPagsPath()");
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setPrefix("/WEB-INF/Pages/");
		ir.setSuffix(".jsp");
		return ir;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileUploadProjctApplication.class, args);
	}

}
