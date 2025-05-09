package com.tcs.loc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Component
public class LocleInterceptorConfig implements WebMvcConfigurer{

	@Autowired
	private LocaleChangeInterceptor lci;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("LocleInterceptorConfig.addInterceptors()");
		registry.addInterceptor(lci);
	}
}
