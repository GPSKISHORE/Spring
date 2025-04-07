package com.tcs.serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.control.EmpRepo;
import com.tcs.enty.EmpEnty;

@Service
public class EmpServ implements IEmpServ{
	
	@Autowired
	private EmpRepo ep;

	@Override
	public String InsrtData(EmpEnty e1) {

		return "Record is inserted with the following reference number - "+ep.save(e1).getEmoNum();
	}

	@Override
	public List<EmpEnty> getData() {

		return ep.findAll();
	}

	@Override
	public String DataDelete(int num) {
		ep.deleteById(num);
		return "Record is deleted with the following num - "+num;
	}

	@Override
	public EmpEnty getDataforUpdate(int num) {
		Optional<EmpEnty> op=ep.findById(num);
		return op.get();
	}

}
