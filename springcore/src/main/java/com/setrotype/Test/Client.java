package com.setrotype.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setrotype.car.Car;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("stereotypeannotation.xml");
		Car c=(Car)context.getBean(Car.class);
		c.printData();
		

	}

}
