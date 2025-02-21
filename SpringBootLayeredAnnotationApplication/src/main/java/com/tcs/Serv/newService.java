package com.tcs.Serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import com.tcs.BO.BOClass;
import com.tcs.dao.Idao;
import com.tcs.dto.dtoClass;
import com.tcs.emp.Employee;

@org.springframework.stereotype.Service

public class newService implements IService{

	@Autowired
	private Idao dao;
	
	@Override
	public List<Integer> getData(Employee dto) throws Exception {
	//	BOClass bo = new BOClass();
		//bo.setEMP_NM("shiva");
		List<Integer> li = dao.getData(dto);
		
		return li;
	}

}
