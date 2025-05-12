package com.tcs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Enty;
import com.tcs.repo.EmpRepo;

@Service
public class EmpServe implements IEmpServe{

	@Autowired
	private EmpRepo er;
	
	@Override
	public String regEmp(Enty en) {
		
		return "Emp Registered with the following id - "+er.save(en).getId();
	}

	@Override
	public List<Enty> show() {
		
		return er.findAll();
	}

	@Override
	public String getResumeFileName(Integer id) {
		
		return er.getResumeFileName(id);
	}

	@Override
	public String getProfileName(Integer id) {
		// TODO Auto-generated method stub
		return er.getProfileName(id);
	}
	
	
}