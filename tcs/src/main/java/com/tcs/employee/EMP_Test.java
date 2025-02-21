package com.tcs.employee;

import java.io.PrintWriter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.controller.EMPController;
import com.tcs.vo.EMPinfovo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EMP_Test extends HttpServlet{
	
	private static String ENO;
	private static String ENAME;
	private static String DESCIGNATION;

	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/ApplicationXML/ApplicationContext.xml");
/*		System.out.println("Please enter the following details..");
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
		sc.close();
*/		PrintWriter out;

		EMPinfovo vo = new EMPinfovo();
		vo.setENO(req.getParameter("emp_no"));
		vo.setENAME(req.getParameter("name"));
		vo.setDESCIGNATION(req.getParameter("DES"));
		
		EMPController empc = factory.getBean("ctr",EMPController.class);
		try {
			String result = empc.contolSetting(vo);
			factory.close();
			System.out.println(result);
			out = res.getWriter();
			out.println("Your records updated with following details ");
			out.println("<h1>"+result+"</h1>");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) {
		doPost(req,res);
	}
    
	/*public static void main(String[] args) {
		
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read= new XmlBeanDefinitionReader(factory);
		read.loadBeanDefinitions("/ApplicationXML/ApplicationContext.xml");
		*/
		
	//}*/
}
