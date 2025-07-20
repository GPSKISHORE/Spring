package com.krish.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/Om")
public class TempControl {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String running_at;

	@GetMapping("/Start")
	public ResponseEntity<String> getData(){
		System.out.println("---------------------------------");
		return new ResponseEntity<String>(" Total Bill Amount is - 1500$, Server running at "+running_at+" and the port number is - "+port,HttpStatus.OK);
	}
}
