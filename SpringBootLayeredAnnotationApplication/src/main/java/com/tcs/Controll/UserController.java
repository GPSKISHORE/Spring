package com.tcs.Controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.Serv.IService;
import com.tcs.VO.VOClass;
import com.tcs.dto.dtoClass;
import com.tcs.emp.Employee;

@Component
public class UserController {

	@Autowired
	private IService se;
	
	public List<Integer> getData(Employee vo) throws Exception {
		
	//	dtoClass dto = new dtoClass();
		//dto.setSal(vo.getSal());
		System.out.println(vo.getDesignation());
		List<Integer> li = se.getData(vo);
		
		return li;
	}
}
