package com.tcs.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tcs.enty.enty;

@Controller
public class StudentConfig {

	@GetMapping("/")
	public String Home() {
		System.out.println("StudentConfig.Home()");
		return "home";
	}
	
	@GetMapping("/register")
	public String reg(@ModelAttribute("enty") enty e) {
		System.out.println("StudentConfig.reg()");
		return "stuReg";
	}
}
