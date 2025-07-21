package com.krish.control;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.krish.model.EMPModel;

@FeignClient("spring-boot-epm-detaills")
public interface APIControl {
	
	@PostMapping("/GetDetails/EMP")
	public String resFromAPI(EMPModel em);
}
