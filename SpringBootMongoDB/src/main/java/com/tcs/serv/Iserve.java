package com.tcs.serv;

import java.util.List;

import com.tcs.enty.Entity;

public interface Iserve {

//	public String insrtData(Entity e);
//	public List<Entity> findallrec();
//	public Entity findIdrec(String id);
//	public Entity ModifyRec(String id,String e);
//	public String DeleteRec(String id);
	
	public List<Entity> fetchData(String nm);
	public List<Entity> fetchrankOrderByName(int r);
}
