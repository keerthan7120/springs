package com.sprongsconfig.noxml;

import javax.swing.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	

	public static void main(String[] args)
	{

		
	      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springsconfig .class);
		  Employeed emp = (Employeed) context.getBean("Employee",EmployeeSerevice.class);
		  
		  
		  System.out.print(emp.getDetails());
		  System.out.println(emp.setDetails());
	
	}

}
