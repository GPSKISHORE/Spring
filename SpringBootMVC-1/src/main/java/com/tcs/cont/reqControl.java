package com.tcs.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.serv.Iserv;

@Controller
public class reqControl {

	@Autowired
	public Iserv se;
	
	@RequestMapping("/Home")
	public String homrPag() {
		return "home";
	}
	@RequestMapping("/Time")
	public ModelAndView timePage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("time",se.getTime());
		mav.setViewName("Time");
		return mav;
	}

	
}
