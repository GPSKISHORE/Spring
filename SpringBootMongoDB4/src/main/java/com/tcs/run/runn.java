package com.tcs.run;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.enty.Entity;
import com.tcs.enty.Medal;
import com.tcs.enty.sportContries;
import com.tcs.serv.Iserve;

@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iserve ser;
	@Override
	public void run(String... args) throws Exception {
		
		Entity en = new Entity();
		en.setSno(null);
		en.setHouse("Hyderabad");
		en.setName("PvSindhu");
		
		sportContries sc = new sportContries();
		sc.setId("123");
		sc.setCountry("US");
		sportContries sc1 = new sportContries();
		sc1.setId("1234");
		sc1.setCountry("Russia");
		en.setSportCon(List.of(sc,sc1));
		
		Medal me = new Medal();
		me.setMedal_Id("789");
		me.setMedalCost("15000");
		me.setMedalType("Gold");
		
		Medal me1 = new Medal();
		me1.setMedal_Id("1789");
		me1.setMedalCost("115000");
		me1.setMedalType("Titanium");
		en.setMed(Map.of("Meds",me1,"Meds1",me));
		
		System.out.println(ser.saveData(en));
	}
	

}
