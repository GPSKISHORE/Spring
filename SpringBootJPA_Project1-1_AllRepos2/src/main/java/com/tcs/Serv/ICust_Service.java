package com.tcs.Serv;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tcs.enty.Cust_Entity_Model;
import com.tcs.enty.RequiredCols2;

public interface ICust_Service {

	public Cust_Entity_Model New_Cust_Insertion(Cust_Entity_Model cem);

	public Iterable<Cust_Entity_Model> cust_sort_data(boolean asc, String... prop);

	public Page<Cust_Entity_Model> getPag(int pagn, int totalPage, boolean asc, String... args);
	
	public  <T extends RequiredCols2> List<T> getRelData(String name,float tx,float tx2,Class cl);
}
