package com.tcs.Serv;

import org.springframework.data.domain.Page;

import com.tcs.enty.Cust_Entity_Model;

public interface ICust_Service {

	public Cust_Entity_Model New_Cust_Insertion(Cust_Entity_Model cem);

	public Iterable<Cust_Entity_Model> cust_sort_data(boolean asc, String... prop);

	public Page<Cust_Entity_Model> getPag(int pagn, int totalPage, boolean asc, String... args);
}
