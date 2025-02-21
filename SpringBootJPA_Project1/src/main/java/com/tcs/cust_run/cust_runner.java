package com.tcs.cust_run;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.cust_enty.Customer_Data;
import com.tcs.cust_serv.Icust_Servece;

@Component
public class cust_runner implements CommandLineRunner {
	
	@Autowired
	private Icust_Servece cs;

	@Override
	public void run(String... args) throws Exception {
		Customer_Data cd = new Customer_Data();
//		cd.setCUST_NAME("Nanna");
//		cd.setBILL_AMOUNT(1500.5f);
//		cd.setMOBILE_NUMBER("8297687576");
//		String res = cs.pass_cust_data(cd);
//		System.out.println(res);
		//System.out.println(cs.table_count());
		//System.out.println(cs.get_data_ByID(1));
//		Iterable<Customer_Data> it = cs.find_all_custData();
//		for(Customer_Data cd:it) {
//			System.out.println(cd);
//			System.out.println(cd.getCUST_NAME());
//		}
//		cd.setCUST_NAME("Siva");
//		cd.setCUST_ID(1);
//		System.out.println(cs.update_data(cd));
	
//		Iterable<Customer_Data> it = cs.save_ll(List.of(new Customer_Data("Raja",250.3f,"82546795"),new Customer_Data("Yamini",2450.65f,"2450564545"),new Customer_Data("Nivas",1502.65f,"9874562")));
//		List.of(it).stream().forEach(System.out::println);
//		it.forEach(i -> System.out.println(i.getCUST_ID()));
		
		//System.out.println(cs.get_data_ByID(2));
		//System.out.println(cs.del_data(252));
		cd.setCUST_ID(253);
		System.out.println(cs.del_data_obj(cd));
	
	}

}
