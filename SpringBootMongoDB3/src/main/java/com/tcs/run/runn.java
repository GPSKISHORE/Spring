package com.tcs.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.enty.Entity;
import com.tcs.enty.Enty2;
import com.tcs.serv.Iserve;

@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iserve ser;
	@Override
	public void run(String... args) throws Exception {
		
		Entity e = new Entity();
		e.setSno(null);
		e.setAmount(2500000);
		Enty2 e2 = new Enty2();
		e2.setBornAs("King");
		e2.setName("Rama");
		//e.setAvataras(e2);
		e.setGold("Yes");
		e.setHouse("Vikuntam");
		e.setKids(true);
		e.setRank(1);
		e.setVehicle("Adishesy");
		e.setVisitedEarth(true);
		e.setName("Vishnu");
		e2.setSno(null);
		e2.setParentData(e);
		System.out.println(ser.InsertThroughParent(e2));
	}
	

}
