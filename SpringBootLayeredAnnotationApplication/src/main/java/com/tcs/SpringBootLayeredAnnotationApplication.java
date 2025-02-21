package com.tcs;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootLayeredAnnotationApplication {

    @Bean
    CommandLineRunner cmd1() {
		CommandLineRunner com = (args) -> Stream.of(args).forEach(System.out::println);
		return com;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLayeredAnnotationApplication.class, args);
	
		
	}
	
	/*public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringBootLayeredAnnotationApplication.class, args);
		UserController uc = con.getBean("userController",UserController.class);
		//VOClass aobj = new VOClass();
		//aobj.setSal("12000");
		Employee em = new Employee();
		em.setDesignation("dev");
		em.setEMP_NM("Satesh");
		em.setSal("1500");
		em.setEMP_Num("391");
		try {
			List<Integer> li = uc.getData(em);
			
			li.forEach(System.out::println);
			System.out.println(li);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/

	
}
