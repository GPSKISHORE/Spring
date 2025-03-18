package com.revision.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revision.enty.ClassEnty;
import com.revision.repo.en1Repo;
import com.revision.repo.en2Repo;

@Service
public class serv implements IService{

	@Autowired
	private en1Repo er1;
	@Autowired
	private en2Repo er2;
	
	@Override
	public String insrData(ClassEnty ce) {
		
		return er1.save(ce).getPid()+" data is stored";
	}


}
