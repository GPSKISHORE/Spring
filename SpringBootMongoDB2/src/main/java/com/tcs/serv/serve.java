package com.tcs.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Entity;
import com.tcs.repo.repoInter;

@Service
public class serve implements Iserve{
	
	@Autowired
	private repoInter rpi;

	@Override
	public String saveData(Entity e) {
		
		return rpi.save(e).getSno()+" is saved.!";
	}

	

}
