package com.tcs.serv;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class serve implements Iserv{

	@Override
	public String getTime() {	
		return LocalDateTime.now()+"";
	}

	
}
