package com.tcs.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RestControl1/api")
public class RestControl1 {

	@GetMapping("/OM/{sno}/{sname}")
	public ResponseEntity<String> res(@PathVariable("sno") int no,@PathVariable String sname,@RequestParam String add){
		return new ResponseEntity<String>((no+" -- "+sname+" -- "+add),HttpStatus.OK);
	}
}
