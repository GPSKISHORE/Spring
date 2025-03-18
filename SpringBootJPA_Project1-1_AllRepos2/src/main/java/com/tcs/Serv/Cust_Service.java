package com.tcs.Serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.tcs.enty.Cust_Entity_Model;
import com.tcs.enty.ICust_Data;
import com.tcs.enty.RequiredCols2;

@Service
public class Cust_Service implements ICust_Service {

	@Autowired
	private ICust_Data icd;
	
	@Override
	public Cust_Entity_Model New_Cust_Insertion(Cust_Entity_Model cem) {
		
		return null;//icd.save(cem);
	}

	@Override
	public Iterable<Cust_Entity_Model> cust_sort_data(boolean asc, String... prop) {
		Sort so = Sort.by(asc?Direction.ASC:Direction.DESC,prop);
		return icd.findAll(so);
	}

	@Override
	public Page<Cust_Entity_Model> getPag(int pagn, int totalPage, boolean asc, String... args) {
		Pageable p1 = PageRequest.of(pagn, totalPage, asc?Direction.ASC:Direction.DESC, args); 
		return icd.findAll(p1);
	}

	@Override
	public <T extends RequiredCols2> List<T> getRelData(String name,float tx,float tx2,Class cl) {
		System.out.println(icd.getClass());
		//return icd.findByCustNameOrTrxType(name,tx);
		return icd.findByCustNameNotLikeAndBillAmountBetweenOrderByCustName(name,tx,tx2,cl);
	}

}
