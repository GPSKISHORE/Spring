package com.tcs.Iserv;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tcs.enty.EmpEnty;

public interface IEmpSer {

	public String Register(EmpEnty e);
	public Page<EmpEnty> getRecords(Pageable pg);
	public String DelData(int num);
	public Set<String> getCon();
	public List<String> getStates(String state);
}
