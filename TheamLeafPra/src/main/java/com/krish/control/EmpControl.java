package com.krish.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.krish.enty.EmpEnty;

@Controller
public class EmpControl {

	@GetMapping("/")
	public String getHome(Model mod,@ModelAttribute EmpEnty e) {
		mod.addAttribute("EmpEnty",e);
		mod.addAttribute("Designation", List.of("CEO","Chairman","Manager","Team Lead","Regional Head","Worker","Devloper","Other"));
		return "EmpReg";
	}
	
	@PostMapping("/Res")
	public String getRes(@ModelAttribute EmpEnty mod,Model mof) {
		mof.addAttribute("EmpEnty",mod);
		return "ResPage";
		
	}
}
