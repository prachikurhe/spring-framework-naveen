package com.dependancyInjection;

public class Test {
	private String name;
	private int age;
	private String email;
	
	//Dependency Injection types-by setter , by constructor
	//By Constructor
		public Test(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}



		public void printData() {
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("email:"+email);
	}

}
