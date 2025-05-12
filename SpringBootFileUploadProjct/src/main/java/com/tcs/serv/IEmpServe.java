package com.tcs.serv;

import java.util.List;

import com.tcs.entity.Enty;

public interface IEmpServe {

	public String regEmp(Enty en);
	
	public List<Enty> show();
	
	public String getResumeFileName(Integer id);
	
	public String getProfileName(Integer id);
}
