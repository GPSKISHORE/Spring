package com.tcs.control;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.enty.EmpComp;
import com.tcs.enty.EmpEnty;
import com.tcs.serve.EmpServe;

@RestController
@RequestMapping("/Shiva")
public class ResControl {

	@Autowired
	public EmpServe es;

	@GetMapping("/Kishore")
	public ResponseEntity<String> passToApi() {
		String dt = LocalDateTime.now().toString();
		ResponseEntity<String> re = new ResponseEntity<String>(dt, HttpStatus.OK);
		return re;
	}

	@GetMapping("/Om")
	public ResponseEntity<List<EmpEnty>> getEmp() {
		// return new ResponseEntity<EmpEnty>(es.getEmpById(7777), HttpStatus.OK);
		return new ResponseEntity<List<EmpEnty>>(es.getAllEmps(7777), HttpStatus.OK);
	}

	@GetMapping("/Mahadev")
	public ResponseEntity<EmpComp> getEmpWithComp() {
		EmpComp ec = new EmpComp("TCS", "Hyderabad", "27800", es.getEmpById(75), List.of("USA", "Dubai", "Kerala"),
				Set.of("TCS", "HCL", "Wipro"), Map.of("Tenth", 8, "Inter", 945, "B.tech", 8));
		return new ResponseEntity<EmpComp>(ec, HttpStatus.OK);
	}
}
