package com.krish.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
@RefreshScope
public class TestController {

	@Value("${app.name}")
	private String name;
	
	@Value("${app.age}")
	private String age;
	
	@GetMapping("/Ok")
	public ResponseEntity<String> getData(){
		return new ResponseEntity<String>("Data Comming from config file - "+name+" "+age,HttpStatus.OK);
	}
}
