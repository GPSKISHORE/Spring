package com.tcs.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.enty.EmpEnty;
import com.tcs.serv.IEmpServ;

@Controller
public class EmpController {

	@Autowired
	private IEmpServ ies;
	
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
	public String insrtDataTable(Map<String,Object> mp,@ModelAttribute("EmpEnty") EmpEnty ep) {
		String res=ies.InsrtData(ep);
		List<EmpEnty> li = ies.getData();
		mp.put("records", li);
		mp.put("response", res);
		return "register";
	}
	
	@GetMapping("Delete_Data")
	public String insrtDataTable(Map<String,Object> mp,@ModelAttribute("emoNum") int num) {
		String res = ies.DataDelete(num);
		List<EmpEnty> li = ies.getData();
		mp.put("records", li);
		mp.put("response", res);
		return "register";
	}
	
	@GetMapping("update_Data")
	public String updateData(@ModelAttribute("emoNum") int num,Map<String,Object> mp) {
		EmpEnty en= ies.getDataforUpdate(num);
		mp.put("enty", en);
		return "update";
	}
	
	@PostMapping("update_Data")
	public String updateData1(@ModelAttribute("EmpEnty") EmpEnty ep,Map<String,Object> mp) {
		String res=ies.InsrtData(ep);
		List<EmpEnty> li = ies.getData();
		mp.put("records", li);
		mp.put("response", res.replace("inserted", "Updated"));
		return "register";
	}
}
