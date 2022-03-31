package com.beanlifecycle.annotation;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("beanlifecycle3.xml");
        while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 for save 2  for close operation ");
			int i=sc.nextInt();
			switch (i) {
			case 1: Test3 t3=(Test3)cap.getBean("t3");
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter address");
			String address=sc.next();
			
			
			t3.save(id, name, email, address);
			break;
			default :
				cap.close();
				break;
				
			}

        }
	}

}
