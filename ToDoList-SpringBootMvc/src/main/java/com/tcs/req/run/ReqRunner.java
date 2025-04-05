package com.tcs.req.run;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.mod.ToDoModel;
import com.tcs.serv.IToDoService;

@Controller
public class ReqRunner implements CommandLineRunner{

	@Autowired
	private IToDoService ids;
	
	@GetMapping("/")
	public String getHome() {
		return "Home";
	}
	@GetMapping("/ToDo")
	public String getHome(Map<String,Object> mp,@RequestParam String sname) {
		System.out.println("Requester Name is - "+sname);
		return "ToDoList";
	}
	
	@GetMapping("/ToDoInsrt")
	public String getToDoInsrt(Map<String,Object> mp,@RequestParam int sno,@RequestParam String tsk,@RequestParam String sname) {
//		System.out.println("Requester Name is - "+tsk+"   "+sname);
//		System.out.println();
		ToDoModel td = new ToDoModel(sno,tsk,sname);
		mp.put("Response", ids.insrtData(td));
		return "ToDoInsrt";
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
