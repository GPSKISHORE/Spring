package com.tcs.cust_serv;

import java.util.List;

import com.tcs.cust_enty.Customer_Data;

public interface Icust_Servece {
	
	public String pass_cust_data(Customer_Data cd);
	public long table_count();
	public Customer_Data get_data_ByID(Integer id);
	public Iterable<Customer_Data> find_all_custData();
	public Customer_Data update_data(Customer_Data cd);
	public Iterable<Customer_Data> save_ll(List<Customer_Data> li);
	public String del_data(Integer id);
	public String del_data_obj(Customer_Data cd);
}
