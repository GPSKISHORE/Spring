package com.tcs.serv;

import java.util.List;

import com.tcs.enty.EntityMultipleTables;

public interface Iservice {

	public String resultS(EntityMultipleTables em);
	
	public List<EntityMultipleTables> getData(int num);
}
