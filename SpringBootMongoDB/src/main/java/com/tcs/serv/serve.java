package com.tcs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Entity;
import com.tcs.repo.repoInter;

@Service
public class serve implements Iserve{
	
	@Autowired
	private repoInter rpi;

	@Override
	public List<Entity> fetchData(String nm) {
		System.out.println(rpi.findByName(nm));
		return rpi.findByName(nm);
	}

	@Override
	public List<Entity> fetchrankOrderByName(int r) {
		
		return rpi.findByrankOrderByNameAsc(r);
	}

//	@Override
//	public String insrtData(Entity e) {
//		
//		return rpi.save(e).getSno()+" record is inserted";
//	}
//
//	@Override
//	public List<Entity> findallrec() {
//		
//		return rpi.findAll();
//	}
//
//	@Override
//	public Entity findIdrec(String id) {
//		Optional<Entity> op= rpi.findById(id);
//		return op.get();
//	}
//
//	@Override
//	public Entity ModifyRec(String id, String e) {
//		Optional<Entity> op= rpi.findById(id);
//		if(op.isPresent()) {
//			Entity ee = op.get();
//			ee.setVehicle(e);
//			return rpi.save(ee);
//		}
//			
//		return null;
//	}
//
//	@Override
//	public String  DeleteRec(String id) {
//		Optional<Entity> op= rpi.findById(id);
//		if(op.isPresent()) {
//			rpi.deleteById(id);
//			return "record Deleteed";
//		}
//		return null;
//	}

}
