package com.tcs.runne;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.enty.EntityMultipleTables;
import com.tcs.serv.Iservice;

@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iservice se;
	
	@Override
	public void run(String... args) throws Exception {
		
		EntityMultipleTables em = new EntityMultipleTables();
		em.setPid(4);
		em.setPName("Subbu");
		em.setFailyPersons(List.of("SubbuDad","Kusuma","KusumaSister"));
		em.setMobileNumbers(Set.of(8786614843L,9511060061L));
		em.setEmailID(Set.of("ganesh@gmail.com","secong@gmail.com"));
		em.setIdsDetails(Map.of("Adhar","92558047","Pan","CMNGS"));
		String res = se.resultS(em);
		System.out.println(res);
		
		se.getData(1).forEach(System.out::println);
	}

	
}
