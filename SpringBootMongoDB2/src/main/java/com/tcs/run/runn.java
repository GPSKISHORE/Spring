package com.tcs.run;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.enty.Entity;
import com.tcs.serv.Iserve;

//@Id
//private String sno;
//@Field(name = "Name")
//private String name;
//private List<String> House;
//private String Vehicle;
//private Integer Amount;
//private Boolean visitedEarth;
//private Boolean Kids;
//private Integer rank;
//private Set<String> geolary;
//private Map<String,String> avataras;
//private Properties avatarasCount;
@Component
public class runn implements CommandLineRunner{

	@Autowired
	private Iserve ser;
	@Override
	public void run(String... args) throws Exception {
		Properties pro = new Properties();
		pro.put("Total_Count", 5);
		Entity e = new Entity(null,"Shiva",List.of("Kailash","Kashi"),"Nandi",150000,true,true,1,Set.of("No"),Map.of("avatar1","Gelandara","avatar2","Anjaneya"),pro );
		System.out.println(ser.saveData(e));
	}
}
