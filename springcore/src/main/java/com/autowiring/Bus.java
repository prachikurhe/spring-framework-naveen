package com.autowiring;

public class Bus {
	private Engine engine;

	public Bus(Engine engine) {
		super();
		this.engine = engine;
	}
	public void printData() {
		System.out.println("Bus engine MODELYEAR:"+engine.getModelYear());
	}

}
