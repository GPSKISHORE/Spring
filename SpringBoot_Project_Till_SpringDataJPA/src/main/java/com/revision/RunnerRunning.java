package com.revision;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.revision.enty.ClassEnty;
import com.revision.enty.SecondTable;
import com.revision.serv.IService;

@Component
public class RunnerRunning implements CommandLineRunner {

	@Autowired
	private IService is;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		ClassEnty ce = new ClassEnty();
		ce.setPid(16);
		ce.setPName("Shiva");
		SecondTable se = new SecondTable();
		se.setPid(16);
		se.setMobileNumbers(995646661L);
		se.setEmailID("fsecrtgm@gmail.com");

		ce.setCi(Set.of(se));
		System.out.println(is.insrData(ce));

	}

}
