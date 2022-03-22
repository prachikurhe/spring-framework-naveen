package com.di.secondarytype;

public class car {
	private String name;
	private Engine1 engine;
	
	public car() {
		System.out.println("Car");
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine1 getEngine() {
		return engine;
	}
	public void setEngine(Engine1 engine) {
		this.engine = engine;
	}
	public void printData() {
		System.out.println("Car name:"+name);
		System.out.println("Model Year:"+engine.getModelYear());
	}
	

}
