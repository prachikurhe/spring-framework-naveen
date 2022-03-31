package com.staticvariabledi;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("staticvariabledi.xml");
		  Emp emp = (Emp)context.getBean("emp");
		  emp.display();
		 
	}

}
