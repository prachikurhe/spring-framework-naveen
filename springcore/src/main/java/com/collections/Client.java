package com.collections;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dependancyInjection.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("collections1.xml");
		Test1 t1=(Test1) ap.getBean("t1");
		t1.printData();
		
		
		

	}

}
