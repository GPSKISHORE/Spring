package com.tcs.employee;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.controller.EMPController;
import com.tcs.vo.EMPinfovo;

public class EMP_Test {
	
	private static String ENO;
	private static String ENAME;
	private static String DESCIGNATION;

    
	public static void main(String[] args) {
		
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read= new XmlBeanDefinitionReader(factory);
		read.loadBeanDefinitions("/ApplicationXML/ApplicationContext.xml");
		*/
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/ApplicationXML/ApplicationContext.xml");
		System.out.println("Please enter the following details..");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter EMP number .. ");
		ENO = sc.next();
		System.out.println("Please enter emp name..");
		ENAME = sc.next();
		System.out.println("Please enter Designation..");
		DESCIGNATION = sc.next();
		
		EMPinfovo vo = new EMPinfovo();
		vo.setENO(ENO);
		vo.setENAME(ENAME);
		vo.setDESCIGNATION(DESCIGNATION);
		
		EMPController empc = factory.getBean("ctr",EMPController.class);
		try {
			String result = empc.contolSetting(vo);
			factory.close();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
