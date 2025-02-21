package com.tcs.dao;

import java.util.List;

import com.tcs.BO.BOClass;
import com.tcs.emp.Employee;

public interface Idao {
	public List<Integer> getData(Employee bo) throws Exception;
}
