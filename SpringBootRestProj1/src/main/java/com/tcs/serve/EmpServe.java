package com.tcs.serve;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.EmpEnty;
import com.tcs.repo.EmpRepo;

@Service
public class EmpServe {

	@Autowired
	private EmpRepo erp;
	
	public EmpEnty getEmpById(Integer num) {
		Optional<EmpEnty> op = erp.findById(num);
		if(!op.isEmpty())
			return op.get();
		else
			return null;
	}
	public List<EmpEnty> getAllEmps(Integer num) {
		return erp.findAll();
	}
}
