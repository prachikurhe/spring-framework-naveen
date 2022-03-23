package com.autowiringusingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Qualifier(value = "e2")
	@Autowired
	private Engine engine;
//no need to have setter or constructor without this we can do DI 

	public void printData() {

		System.out.println("Engine modelyear:" + engine.getModelYear());
	}

}
