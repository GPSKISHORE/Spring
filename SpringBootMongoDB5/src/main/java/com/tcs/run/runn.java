package com.tcs.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.serv.Iserve;

@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iserve ser;
	@Override
	public void run(String... args) throws Exception {
		
		//ser.fetchAllRecods(true,"YES",180000).forEach(System.out::println);
		ser.fetRecordsBasedonOrCon("Parvathi", "Vishnu").forEach(System.out::println);
	}
	

}
