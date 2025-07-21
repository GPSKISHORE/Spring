package com.krish.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.krish.model.EMPModel;

@RestController
public class RestAPIHit {

	@Autowired
	private APIControl al;
	
	@GetMapping("/SaveEMP/{name}/{sal}/{Designation}")
	public ResponseEntity<String> saveData(@PathVariable String name,@PathVariable int sal,@PathVariable String Designation) {
		return new ResponseEntity<String>(al.resFromAPI(new EMPModel(name,sal,Designation)),HttpStatus.OK);
	}
}
