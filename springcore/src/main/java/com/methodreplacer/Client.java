package com.methodreplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("methodReplacer.xml");
		Bank b=(Bank) ap.getBean("b");
		b.deposite();
		b.withdraw();
		b.calInt();
		
}
}
