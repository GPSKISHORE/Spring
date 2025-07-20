package com.krish.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MicroServices-Payment-Clients")
public interface ProxyImpl {

	@GetMapping("/Api/Om/Start")
	public ResponseEntity<String> getData();
}
