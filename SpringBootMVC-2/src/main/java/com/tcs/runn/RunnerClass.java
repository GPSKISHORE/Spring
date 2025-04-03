package com.tcs.runn;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcs.ent.Enty;
import com.tcs.iserv.Iserve;

@Controller
public class RunnerClass {

	@Autowired
	private Iserve se;
	
	@RequestMapping(value = "/")
	public String HomePage(Map<String,Object> mp) {
//		mp.put("Names", List.of("Shiva","Eswara","Bola Shenkara","Nilakantam","Uma"));
//		mp.put("Vepana", Set.of("Suvalam","Axe","Knife"));
//		mp.put("Locations", Map.of("Kashi","Viswanath","Patna","Somnath","Mallikarjuna","Sri sailam"));
		
		List<Enty> e= List.of(new Enty(12,"Kishore"),new Enty(13,"Amma"));
		mp.put("EnClas", e);
		return "home";
	}
	
//	public String HomePage(HttpServletResponse res) throws IOException {
//		
//		PrintWriter pw = res.getWriter();
//		pw.write("<h1><b>Get from PrintWriter</b></h1>");
//		return "redirect:time";
//	}
//	@RequestMapping(value = "/")
//	public String HomePage1() {
//		return "home";
//	}
//	@RequestMapping
//	public String HomePage2() {
//		return "home";
//	}
//	@RequestMapping({"/Time","/time"})
//	public String TimePage(Map<String, Object> mp) {
//		mp.put("Name", "Shiva");
//		mp.put("Time", se.getTime());
//		return "time";
//	}
//	@RequestMapping({"/time"})
//	public void TimePage(Map<String, Object> mp) {
//		mp.put("Name", "Shiva");
//		mp.put("Time", se.getTime());
//	}
//	@RequestMapping({"/time","/Time"})
//	public String TimePage(Model mp) {
//		mp.addAttribute("Name", "Shiva");
//		mp.addAttribute("Time", se.getTime());
//		return "time";
//	}
//	@RequestMapping("/")
//	public String TimePage1(Model mp) {
//		mp.addAttribute("Name", "Shiva");
//		mp.addAttribute("Time", se.getTime());
//		return "time";
//	}
}
