package com.tcs.runn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.tcs.Serv.ICust_Service;
import com.tcs.enty.Cust_Entity_Model;

@Component
public class cust_Run implements CommandLineRunner{
	
	@Autowired
	private ICust_Service ics;
	//private ICust_Data ics;
	
	@Override
	public void run(String... args) throws Exception {
		
		//String trx_ref = LocalDateTime.now().toString().replace("-", "").replace(":", "").substring(0,15)+"GSR";
		//Cust_Entity_Model cem = new Cust_Entity_Model();
		
//		ics.cust_sort_data(true, "custName").forEach(System.out::println);
//		System.out.println();
		Page<Cust_Entity_Model> p1=ics.getPag(1, 2, true, "custName");
		System.out.println(p1.getNumber());
		System.out.println(p1.getSize());
		System.out.println(p1.getTotalPages());
		System.out.println(p1.getPageable());
		System.out.println(p1.getContent());
		
//		cem.setCust_Mob_Number(7661980740L);
//		cem.setCust_Name("Sri Ram");
//		cem.setTrx_Type("Phone Pay");
//		cem.setTrx_Refe_Num(trx_ref+cem.getCust_Mob_Number().toString().substring(5)+cem.getCust_Mob_Number().toString().substring(0,5));
//		cem.setBill_Amount(9250f);
//		
//		System.out.println(ics.save(cem));
//		ics.findAll().forEach(System.out::println);
//		System.out.println(ics.findById(5).orElseThrow(() -> new IllegalArgumentException("No Data Found")));
	
		
	}

}
