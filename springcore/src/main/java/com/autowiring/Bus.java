package com.autowiring;

public class Bus {
	private Engine engine;

	public Bus(Engine engine) {
		System.out.println("parameter bus constructor");
		this.engine = engine;
	}
	public void setEngine(Engine engine) {
		System.out.println("engine setter method");
		this.engine = engine;
	}
	public void printData() {
		System.out.println("Bus engine MODELYEAR:"+engine.getModelYear());
	}
	/*public Bus() {
		System.out.println("default  bus constructor");
			}*/

}
