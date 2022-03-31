package com.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("lookupmethod.xml");
		System.out.println("---Car---");
		Car c = (Car) ap.getBean("c");
		System.out.println(c.getClass().getCanonicalName());//spring not created bean for interface but for this interface child class generated at runtime by bytecode  
		System.out.println(c.myCarEngine().getName());
		
		System.out.println("---Bus---");
		Bus b=(Bus) ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.myBusEngine().getName());
		
		System.out.println("---Truk---");
		Truk t=(Truk) ap.getBean("t");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.myTrukEngine().getName());
	}

}
