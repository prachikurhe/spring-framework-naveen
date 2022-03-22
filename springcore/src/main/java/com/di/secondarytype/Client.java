package com.di.secondarytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String files[]=new String[] {"car.xml","engine.xml"};

		ApplicationContext context=new ClassPathXmlApplicationContext(files);
		car c=(car) context.getBean("c");
		
        c.printData();

	}

}
