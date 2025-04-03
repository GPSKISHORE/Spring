package com.tcs.runn;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.enty.Student;

@Controller
public class Runr {

	@GetMapping("/")
	public String getHome() {
		return "home";
	}
	
	@GetMapping("/register")
	public String getregi(Map<String,Object> mp) {
		Student st = new Student();
		mp.put("sno", st.getSno());
		return "register";
	}
	
	@PostMapping("/register")
	public String getSdata(Map<String,Object> mp,@ModelAttribute("stud")Student st) {
		System.out.println(st);
		return "result";
	}
}
