package com.tcs.serv;

import java.util.List;

import com.tcs.enty.Entity;

public interface Iserve {

	public List<Entity> fetchAllRecods(Boolean name,String par,int amo);
	public List<Entity> fetRecordsBasedonOrCon(String name,String name2);
}
