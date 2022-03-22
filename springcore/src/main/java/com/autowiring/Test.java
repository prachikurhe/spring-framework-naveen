package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context =new ClassPathXmlApplicationContext("autowiring1.xml");
		//Car c=(Car) context.getBean("c");
		//c.printData();
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("autowiring2.xml");
		Bus b=(Bus) context.getBean("b");
		b.printData();


	}

}
