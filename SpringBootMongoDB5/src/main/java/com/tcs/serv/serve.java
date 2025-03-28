package com.tcs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Entity;
import com.tcs.repo.repoInter;

@Service
public class serve implements Iserve{
	
	@Autowired
	private repoInter rpi;

	@Override
	public List<Entity> fetchAllRecods(Boolean name,String par,int amo) {
		
		return rpi.getAllRecods(name,par,amo);
	}

	@Override
	public List<Entity> fetRecordsBasedonOrCon(String name, String name2) {
		
		return rpi.getRecordsBasedonOrCon(name,name2);
	}

	@Override
	public List<Entity> fetRecordsUsingLike(String name) {
		
		return rpi.getRecordsUsingLike(name);
	}

	@Override
	public List<Entity> getRecordsUsingSort() {
		
		return rpi.getRecordsUsingSort();
	}

	@Override
	public int getRecordsUsingCount(String name) {
		return rpi.getRecordsUsingCount(name);
	}
	
	

}
