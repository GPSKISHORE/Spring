package com.krish.model;

import org.springframework.stereotype.Component;

@Component
public class EMPModel {

	private String eName;

	private int sal;

	private String designation;
	
	public EMPModel() {
		
	}

	public EMPModel(String eName, int sal, String designation) {
		super();
		this.eName = eName;
		this.sal = sal;
		this.designation = designation;
	}
	
}
