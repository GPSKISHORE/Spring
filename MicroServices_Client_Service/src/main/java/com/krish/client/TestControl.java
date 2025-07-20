package com.krish.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

	@Autowired
	TestClient tc;
	
	@GetMapping("/Shiva")
	public ResponseEntity<String> get2ndAPi(){
		System.out.println("***************************");
		return new ResponseEntity<String>("Billing items 1 Shirt and 1 Pant - "+tc.getDataFromApi(),HttpStatus.OK);
	}
}
