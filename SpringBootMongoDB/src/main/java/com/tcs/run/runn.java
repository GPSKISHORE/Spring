package com.tcs.run;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.enty.Entity;
import com.tcs.serv.Iserve;

@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iserve ser;
	@Override
	public void run(String... args) throws Exception {
		
		ser.fetchData("Vishnu").forEach(System.out::println);
		ser.fetchrankOrderByName(1).forEach(System.out::println);
//		Entity e = new Entity(UUID.randomUUID().toString(),"Surya","Surya Lokam","Horse",180000,true,true,1,"YES");
//		System.out.println(ser.insrtData(e));

		//ser.findallrec().forEach(System.out::println);
		//System.out.println(ser.findIdrec("67d8df30220f37213b220cb2"));
		//System.out.println(ser.ModifyRec("67d8df30220f37213b220cb2", "Lion").getVehicle());
		//System.out.println(ser.ModifyRec("67ddf30220f37213b220cb2", "Lion").getVehicle());
		//System.out.println(ser.DeleteRec("67d8df30220f37213b220cb2"));
	}
	

}
