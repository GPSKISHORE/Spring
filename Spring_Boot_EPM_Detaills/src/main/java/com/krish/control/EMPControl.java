package com.krish.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krish.model.EMPModel;
import com.krish.serv.EMPServe;

@RestController
@RequestMapping("/GetDetails")
public class EMPControl {
	
	@Value("${app.name}")
	private String name;
	
	@Autowired
	private EMPServe es;
	
	@PostMapping("/EMP")
	public ResponseEntity<String> getD(@RequestBody EMPModel em){
		return new ResponseEntity<String>(es.porcessData(em)+" - EMP data stored with this number"+" , This name came from Config Server - "+name,HttpStatus.OK);
	}

}
