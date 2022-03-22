package com.scheema;

public class Car {
	private String name;
	private Engine1 engine;
	

	public Engine1 getEngine() {
		return engine;
	}


	public void setEngine(Engine1 engine) {
		this.engine = engine;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void printData() {
		System.out.println("Car name:"+name);
		System.out.println("Model Year:"+engine.getModelYear());

	
}
}