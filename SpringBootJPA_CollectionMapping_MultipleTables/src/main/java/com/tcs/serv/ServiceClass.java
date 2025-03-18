package com.tcs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.EntityMultipleTables;
import com.tcs.repo.repo;

@Service
public class ServiceClass implements Iservice{
	
	@Autowired
	private repo re;

	@Override
	public String resultS(EntityMultipleTables em) {
		
		return re.save(em).getPid()+" Data is inserted";
	}

	@Override
	public List<EntityMultipleTables> getData(int num) {
		
		return re.findAll();
	}
	
	
}
