package com.tcs.runn;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.enty.Student;

@Controller
public class Runr {
	
	@GetMapping("/")
	public String getHome() {
		return "data";
	}

	@GetMapping("/reg")
	public String getData(Map<String,Object> mp,@RequestParam int sno,@RequestParam(defaultValue = "Eswara") String sname) {
		System.out.println(sno + "  "+sname);
		//mp.put(sno, 8);
	//	mp.put("name", "Mallikarjuna Swami");
		return "reg";
	}
//	@GetMapping("/")
//	public String getHome() {
//		return "home";
//	}
	
	@GetMapping("/register")
	public String getregi(@ModelAttribute Student st) {
		st.setSname("Shiva");
		return "register";
	}
	
	@PostMapping("/register")
	public String getSdata(@ModelAttribute("stud")Student st) {
		System.out.println(st);
		return "result";
	}
}
