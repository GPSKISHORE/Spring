package com.tcs.serve;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.EmpEnty;
import com.tcs.exception.UserException;
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
	
	public List<EmpEnty> getEmp(String num1,String num2){
		System.out.println("EmpServe.getEmp() ++++ ");
		if(erp.getEmp(num1, num2).size()>0) {
			List<EmpEnty> en = erp.getEmp(num1, num2);
			System.out.println("EmpServe.getEmp() "+en);
			//Collections.sort( en , (t1,t2)-> Integer.compare(t1.getEmoNum(), t2.getEmoNum()));
			en.sort(Comparator.comparing(EmpEnty::getDesignation));
			return en;
		}
		else {
			System.out.println("EmpServe.getEmp() + ------");
			throw  new UserException("No Records Found with the entered names");
		}
	}
}
