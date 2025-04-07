package com.tcs.serv;

import java.util.List;

import com.tcs.enty.EmpEnty;

public interface IEmpServ {

	public String InsrtData(EmpEnty ep);
	
	public List<EmpEnty> getData();
	
	public String DataDelete(int num);
	
	public EmpEnty getDataforUpdate(int num);
}
