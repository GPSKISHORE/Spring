package com.krish.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayCls {

	@Autowired
	public ProxyImpl pi;
	
	@GetMapping("/Shiva")
	public ResponseEntity<String> getD(){
		return new ResponseEntity<String>("Billing items 1 Shirt and 1 Pant - "+pi.getData(),HttpStatus.OK);
	}

}
