package com.tcs.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.enty.Enty2;
import com.tcs.repo.repoInter;
import com.tcs.repo.repoInter2;

@Service
public class serve implements Iserve{
	
	@Autowired
	private repoInter rpi;

	@Autowired
	private repoInter2 rpi2;

	@Override
	public String InsertThroughParent(Enty2 e) {

		return rpi2.save(e).getParentData().getName()+" is Saved...";
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
