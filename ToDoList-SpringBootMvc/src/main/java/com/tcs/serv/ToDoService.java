package com.tcs.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.mod.ToDoModel;
import com.tcs.mod.ToDoRepo;

@Service
public class ToDoService implements IToDoService {

	@Autowired
	private ToDoRepo tdr;
	
	@Override
	public String insrtData(ToDoModel td) {
				
		return tdr.save(td).getTaskName()+"is inserted";
	}
	
}
