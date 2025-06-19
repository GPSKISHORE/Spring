package com.tcs.control;

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tcs.Iserv.IEmpSer;
import com.tcs.enty.EmpEnty;
import com.tcs.valid.EmpValidator;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpControl {

	@Autowired
	IEmpSer ie;
	
	@Autowired
	EmpValidator ev;

//	@RequestMapping
//	public String HomePage(Map<String,Object> mp) {
//		mp.put("EmpEnty",new EmpEnty());
//		return "Records";
//	}
	
	@ModelAttribute("CountryInfo")
	public Set<String> getCountry(){
		return ie.getCon();
	}

	@GetMapping
	public String HomePage(@PageableDefault(page=0,size=5,sort="emoNum",direction=Sort.Direction.ASC) Pageable page,Map<String, Object> mp) {
		Page<EmpEnty> dataFromDb = ie.getRecords(page);
		mp.put("DbRecods", dataFromDb);
		return "ShowRecords";
	}

	@GetMapping("Dinsrt")
	public String InsertPage(@ModelAttribute("EmpEnty") EmpEnty ee) {
		return "Home";
	}

	@PostMapping("Dinsrt")
	public String ReturnHome(@ModelAttribute("EmpEnty") EmpEnty ee, @RequestParam("gen") String ge, HttpSession hs,
			BindingResult error,@RequestParam("isValid") String val) {
		System.out.println(ee);
		if(val.equalsIgnoreCase("no")) {
			System.out.println(val);
			if (error.hasFieldErrors())
				return "Home";
			if(ev.supports(ee.getClass())) {
				ev.validate(ee, error);
				if(error.hasErrors())
					return "Home";
			}
			if (ee.getEName().matches(".*\\d.*")) {
				error.rejectValue("eName", "Ename.reject");
				return "Home";
			} else if (ee.getDesignation().equalsIgnoreCase("Java")) {
				error.rejectValue("designation", "job.reject");
				return "Home";
			}
		}
		System.out.println(ge + " Gender");
		String res = ie.Register(ee);
		hs.setAttribute("response", res);
		return "redirect:/";
	}

	@GetMapping("Delete_Data")
	public String Delete_Data(@RequestParam int emoNum, RedirectAttributes red) {
		String res = ie.DelData(emoNum);
		red.addFlashAttribute("response", res);
		return "redirect:/";
	}
	
	@PostMapping("StateList")
	public String getSt(@RequestParam("country") String con,@RequestParam String gen,@ModelAttribute("EmpEnty") EmpEnty emp,Map<String,Object> mp) {
		System.out.println("EmpControl.getSt()"+emp.getDob()+" --- "+emp.getDesignation());
		System.out.println("Country -- > "+con);
		mp.put("stateList", ie.getStates(con));
		mp.put("EmpEnty", emp);
		mp.put("gen", gen);
		return "Home";
	}
	
	@InitBinder
	public void dateConvertion(WebDataBinder web) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		web.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, true));
		System.out.println("custom xecution()");
	}
	
	
}