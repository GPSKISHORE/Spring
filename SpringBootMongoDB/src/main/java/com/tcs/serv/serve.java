package com.tcs.serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Entity;
import com.tcs.repo.repoInter;

@Service
public class serve implements Iserve{
	
	@Autowired
	private repoInter rpi;

	@Override
	public String insrtData(Entity e) {
		
		return rpi.save(e).getSno()+" record is inserted";
	}

	@Override
	public List<Entity> findallrec() {
		
		return rpi.findAll();
	}

	@Override
	public Entity findIdrec(String id) {
		Optional<Entity> op= rpi.findById(id);
		return op.get();
	}

	@Override
	public Entity ModifyRec(String id, String e) {
		Optional<Entity> op= rpi.findById(id);
		if(op.isPresent()) {
			Entity ee = op.get();
			ee.setVehicle(e);
			return rpi.save(ee);
		}
			
		return null;
	}

	@Override
	public String  DeleteRec(String id) {
		Optional<Entity> op= rpi.findById(id);
		if(op.isPresent()) {
			rpi.deleteById(id);
			return "record Deleteed";
		}
		return null;
	}

}
