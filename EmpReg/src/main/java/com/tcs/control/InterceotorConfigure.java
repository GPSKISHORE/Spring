package com.tcs.control;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tcs.inter.EmpInterceoter;

@Component
public class InterceotorConfigure implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("InterceotorConfigure.addInterceptors()");
		registry.addInterceptor(new EmpInterceoter());
	}
}
