package com.tcs.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tcs.enty.EmpEnty;
import com.tcs.serv.IEmpServ;
import com.tcs.validation.EmpValidator;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

	@Autowired
	private IEmpServ ies;
	
	@Autowired
	private EmpValidator ev;
	
	@GetMapping("/")
	public String hetHome() {
		return "home";
	}
	
	@GetMapping("register")
	public String DataReg(Map<String,Object> mp) {
		List<EmpEnty> li = ies.getData();
		mp.put("records", li);
		return "register";
	}
	
	@GetMapping("show_Data")
	public String insrtData(@ModelAttribute("EmpEnty") EmpEnty ep) {
		return "show_Data";
	}
	
	@PostMapping("show_Data")
	public String insrtDataTable(HttpSession hs,@ModelAttribute("EmpEnty") EmpEnty ep,BindingResult errors) {
		if(errors.hasFieldErrors())
			return "show_Data";
		if(ev.supports(ep.getClass())) {
			ev.validate(ep, errors);
			if(errors.hasErrors())
				return "show_Data";
		}
		if(ep.getDesignation().matches(".*\\d.*")) {
			errors.rejectValue("eName", "Ename.reject");
			return "show_data";
		}else
		if(ep.getDesignation().equalsIgnoreCase("Java")) {
			errors.rejectValue("designation", "job.reject");
			return "show_Data";
		}
		String res=ies.InsrtData(ep);
		hs.setAttribute("response", res);
		return "redirect:register";
	}
	
	@GetMapping("Delete_Data")
	public String insrtDataTable(RedirectAttributes red,@ModelAttribute("emoNum") int num) {
		String res = ies.DataDelete(num);
		List<EmpEnty> li = ies.getData();
		red.addFlashAttribute("records", li);
		red.addFlashAttribute("response", res);
		return "redirect:register";
	}
	
	@GetMapping("update_Data")
	public String updateData(@ModelAttribute("emoNum") int num,Map<String,Object> mp) {
		EmpEnty en= ies.getDataforUpdate(num);
		mp.put("enty", en);
		return "update";
	}
	
	@PostMapping("update_Data")
	public String updateData1(RedirectAttributes rat,@ModelAttribute("EmpEnty") EmpEnty ep,Map<String,Object> mp) {
		String res=ies.InsrtData(ep);
		rat.addFlashAttribute("response", res.replace("inserted", "Updated"));
		return "redirect:register";
	}
}
