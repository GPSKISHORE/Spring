package com.GSR.store;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.controller.store.custController;
import com.vo.store.custVO;

public class CustomersBilling {
	
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(factory);
		read.loadBeanDefinitions("/com/appControlling/store/ApplicationContext.xml");
		
		System.out.println("Please enter the following details.. ");
		Scanner sc = new Scanner(System.in);
		custVO vo = new custVO();
		System.out.println("Please enter the mobile number .. ");
		vo.setMOB_NUM(sc.next());
		System.out.println("Please enter the name .. ");
		vo.setC_NAME(sc.next());
		System.out.println("Please enter pincode .. ");
		vo.setPINCODE(sc.next());
		System.out.println("Please enter Bill Amount .. ");
		vo.setBILL_AMT(sc.next());
		
		custController cc =factory.getBean("custC",custController.class);

		try {
			System.out.println(cc.DataGetting(vo));
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
