package com.tcs.DB;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tcs.user.target;

import lombok.Data;

@ConfigurationProperties(prefix = "shiva.io")
@Data
@Component
public class propFile {
	
	private String name;
	
	private Set<String> data1;
	
	private List<String> data2;
	
	private Map<String,String> data3;
	
	private target data4;
	
	
}
