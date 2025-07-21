package com.krish.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krish.model.EMPModel;
import com.krish.model.EMPRepo;

@Service
public class EMPServe {
	
	@Autowired
	private EMPRepo er;
	
	public int porcessData(EMPModel em) {
		return er.save(em).getEmoNum();
	}

}
