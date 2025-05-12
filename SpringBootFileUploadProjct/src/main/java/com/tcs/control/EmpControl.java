package com.tcs.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tcs.entity.EmpModel;
import com.tcs.entity.Enty;
import com.tcs.serv.IEmpServe;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EmpControl {

	@Autowired
	private IEmpServe es;

	@Autowired
	private Environment env;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/reg")
	public String register(@ModelAttribute("en") EmpModel e) {
		return "register";
	}

	@PostMapping("/reg")
	public String register(@ModelAttribute("en") EmpModel e, Map<String, Object> obj) {
		MultipartFile mpf = e.getResume();
		MultipartFile mpf1 = e.getImg();

		String file = env.getRequiredProperty("profile.location");
		File f = new File(file);
		if (!f.exists())
			f.mkdir();

		String resumePath = f.getAbsolutePath() + "\\" + mpf.getOriginalFilename();
		String imgPath = f.getAbsolutePath() + "\\" + mpf1.getOriginalFilename();

		System.out.println(mpf.getName());
		System.out.println(mpf.getOriginalFilename());
		System.out.println(mpf1.getName());

		try (InputStream is = mpf.getInputStream();
				InputStream is1 = mpf1.getInputStream();
				OutputStream ou = new FileOutputStream(resumePath);
				OutputStream ou1 = new FileOutputStream(imgPath)) {

			IOUtils.copy(is, ou);
			IOUtils.copy(is1, ou1);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Enty ee = new Enty();
		ee.setName(e.getName());
		ee.setResume(resumePath);
		ee.setImg(imgPath);

		String final_res = es.regEmp(ee);

		obj.put("res", final_res);
		obj.put("img1", mpf1.getOriginalFilename());
		obj.put("res1", mpf.getOriginalFilename());

		return "Final_Verdit";
	}
	
	@GetMapping("/showRec")
	public String ShowRecords(Map<String,Object> mp) {
		
		mp.put("recD", es.show());
		return "show_records";
	}
	
	@Autowired
	private ServletContext sc;
	
	@GetMapping("/dowload")
	public void dowloadRec(HttpServletResponse res,@RequestParam("data") String resu,@RequestParam("Type") String type) {
		//System.out.println(resu);
		String fle_nm="";
		if(type.equalsIgnoreCase("resume"))
			fle_nm=es.getResumeFileName(Integer.parseInt(resu));
		else
			fle_nm=es.getProfileName(Integer.parseInt(resu));
		//System.out.println(fle_nm);
		File file = new File(fle_nm);
		
		try(InputStream fle = new FileInputStream(fle_nm);
			OutputStream fou = res.getOutputStream()){
			//System.out.println(file.length());
			res.setContentLengthLong(file.length());
			String mt = sc.getMimeType(resu);
			mt = mt==null?"application/octet-stream":mt;
			//System.out.println(mt);
			res.setContentType(mt);
			res.setHeader("Content-Disposition", "attachment;fileName="+file.getName());
			//System.out.println(file.getName());
			IOUtils.copy(fle,fou);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
