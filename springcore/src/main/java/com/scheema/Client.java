package com.scheema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext context=new ClassPathXmlApplicationContext("scheema.xml");
		Car c=(Car) context.getBean("c");
		
        c.printData();

	}

}
