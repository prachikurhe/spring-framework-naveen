package com.beans;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Resource resource=new ClassPathResource("spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Test t=(Test) factory.getBean("t");
		t.hello;
		*/
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//Test t=(Test) context.getBean("t");
		//t.hello();
		//t.hello();
		
		
		try {
		Class c=Class.forName("com.beans.Test");
		Constructor  con[]=c.getDeclaredConstructors();
		             con[0].setAccessible(true);
		             con[0].newInstance(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
