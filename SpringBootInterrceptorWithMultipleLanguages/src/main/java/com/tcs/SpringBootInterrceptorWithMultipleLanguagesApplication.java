package com.tcs;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringBootInterrceptorWithMultipleLanguagesApplication {

    @Bean("localeResolver")
    SessionLocaleResolver inrer18() {
    	System.out.println("SpringBootInterrceptorWithMultipleLanguagesApplication.inrer18()");
    	SessionLocaleResolver sc = new SessionLocaleResolver();
    	sc.setDefaultLocale(new Locale("en","US"));
		return sc;	
	}

    @Bean
    LocaleChangeInterceptor change() {
    	System.out.println("SpringBootInterrceptorWithMultipleLanguagesApplication.change()");
    	LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
    	lci.setParamName("lang");
    		return lci;
    }
    public static void main(String[] args) {
		SpringApplication.run(SpringBootInterrceptorWithMultipleLanguagesApplication.class, args);
	}

}
