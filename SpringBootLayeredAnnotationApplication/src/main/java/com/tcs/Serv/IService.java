package com.tcs.Serv;

import java.util.List;

import com.tcs.dto.dtoClass;
import com.tcs.emp.Employee;

public interface IService {

	public List<Integer> getData(Employee dto) throws Exception;
}
