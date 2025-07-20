package com.krish.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestClient {

	@Autowired
	public LoadBalancerClient dic;
	//public DiscoveryClient dic;
	
	public String getDataFromApi() {
		System.out.println("++++++++++++++++++++++++++++++++");
		ServiceInstance ins = dic.choose("MicroServices_Payment_Clients");	
		String uri = ins.getUri().toString();
		String url = uri+"/Api/Om/Start";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> res =rt.getForEntity(url, String.class);
		return res.getBody();
	}
}
