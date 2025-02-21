package com.tcs.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ClassRun implements ApplicationRunner{
	
//	public void run(String...args) throws Exception{
//		System.out.println("Class run method");
//		System.out.println(Arrays.toString(args));
//	}

	@Override
	@Order(10)
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionValues("name"));
		
	}
}
