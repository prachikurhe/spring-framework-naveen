package com.factorymethods;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("factorymethod.xml");
		Test t = (Test) ap.getBean("t");
		Calendar c = (Calendar) ap.getBean("c");
	}

}
