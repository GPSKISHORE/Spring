package com.tcs.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

	@RequestMapping("/Home")
	public String ReqMapJSP() {
		return "Welcome";
	}
}
