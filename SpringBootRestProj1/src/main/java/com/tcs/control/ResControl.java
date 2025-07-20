package com.tcs.control;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/Govindha")
	public ResponseEntity<EmpComp> getReqBody(@RequestBody EmpComp stub){
		stub.setEducation(Map.of("B.Tech",8));
		stub.setLocation("MTM");
		return new ResponseEntity<EmpComp>(stub,HttpStatus.OK);
	}
	
	@GetMapping("/Shakti/{num1}/{num2}")
	public ResponseEntity<?> getDetails(@PathVariable("num1") String num11,@PathVariable String num2){
		try {
			System.out.println("ResControl.getDetails()");
			return new ResponseEntity<List<EmpEnty>>(es.getEmp(num11, num2),HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	@GetMapping("/Maping")
	public ResponseEntity<Map<String,Object>> getData(){
		return new ResponseEntity<Map<String,Object>>(Map.of("Adhar","9510","Pan","cmn","Mobile","766"),HttpStatus.OK);
	}
}
