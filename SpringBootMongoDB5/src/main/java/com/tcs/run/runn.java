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
		//ser.fetRecordsBasedonOrCon("Parvathi", "Vishnu").forEach(System.out::println);
		//ser.fetRecordsUsingLike("^V").forEach(System.out::println);	//starts with
		//ser.fetRecordsUsingLike("i$").forEach(System.out::println);	//Ends wth
		//ser.fetRecordsUsingLike("a").forEach(System.out::println);	//Contains
		//ser.fetRecordsUsingLike("^s$").forEach(System.out::println);	//Middle letters
		//ser.getRecordsUsingSort().forEach(System.out::println);
		
		System.out.println(ser.getRecordsUsingCount("YES"));
	}
	

}
