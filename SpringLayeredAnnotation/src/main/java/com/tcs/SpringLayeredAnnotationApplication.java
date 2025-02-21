package com.tcs;

import java.sql.SQLException;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tcs.DB.propFile;

@SpringBootApplication
public class SpringLayeredAnnotationApplication {

	@Bean("cal")
	Calendar calen() {
		return Calendar.getInstance();
	}
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(SpringLayeredAnnotationApplication.class, args);
		propFile tar = ctx.getBean("propFile",propFile.class);
		
		System.out.println(tar.getName());
		System.out.println(tar.getData1());
		System.out.println(tar.getData2());
		System.out.println(tar.getData3());
		System.out.println(tar.getData4());
	}

}
