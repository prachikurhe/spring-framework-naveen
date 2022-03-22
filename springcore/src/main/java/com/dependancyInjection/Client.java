package com.dependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("constructordi.xml");
		Test t1=(Test) context.getBean("t1");
		t1.printData();

	}

}
