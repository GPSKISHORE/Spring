package com.tcs.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Enty;
import com.tcs.enty.repo;

@Service
public class serve implements Iserve {

	@Autowired
	private repo r;
	@Override
	public String insrtToDB(Enty e) {
		
		return r.save(e).getCustId()+" id is inserted";
	}

}
