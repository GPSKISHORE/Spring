package com.tcs.cust_serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.cust_enty.Cust_DataBase_Inter;
import com.tcs.cust_enty.Customer_Data;

@Service
public class cust_Service implements Icust_Servece {

	@Autowired
	private Cust_DataBase_Inter cdi;
	
	@Override
	public String pass_cust_data(Customer_Data cd) {
		Customer_Data count=cdi.save(cd);
		return count.toString();
	}

	@Override
	public long table_count() {
		
		return cdi.count();
	}

	@Override
	public Customer_Data get_data_ByID(Integer id) {
		Optional<Customer_Data> cd =cdi.findById(id);
		Customer_Data cd1=null;
		if(cd.isPresent()) {
			Customer_Data cdq =cd.get();
			cdq.setCUST_NAME("Mani Raja");
			cd1 = cdi.save(cdq);
		}
		
		return cd1;
	}

	@Override
	public Iterable<Customer_Data> find_all_custData() {
		return cdi.findAll();
	}

	@Override
	public Customer_Data update_data(Customer_Data cd) {
		
		return cdi.save(cd);
	}

	@Override
	public Iterable<Customer_Data> save_ll(List<Customer_Data> li) {
		
		return cdi.saveAll(li);
	}

	@Override
	public String del_data(Integer id) {
		Optional<Customer_Data> cd = cdi.findById(id);
		cdi.delete(cd.get());
		return "recod deleted";
	}

	@Override
	public String del_data_obj(Customer_Data cd) {
		cdi.delete(cd);
		return "data deleted";
	}

}
