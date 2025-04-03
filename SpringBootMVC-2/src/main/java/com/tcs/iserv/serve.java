package com.tcs.iserv;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class serve implements Iserve {

	@Override
	public String getTime() {
		
		return LocalDateTime.now()+" is our current date and dtime";
	}

}
