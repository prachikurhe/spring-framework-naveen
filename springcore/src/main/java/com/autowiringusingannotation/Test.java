package com.autowiringusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("autowiringAnnotation.xml");
		Car c=(Car) context.getBean("c");
		c.printData();
		
		

	}

}
