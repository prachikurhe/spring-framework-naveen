package com.staticvariabledi;

public class Emp {
	public static String empName;

	public static void setEmpName(String empName) {
		Emp.empName = empName;
	}

	public static void display() {
		System.out.println("EmpName is:" + empName);
	}

}
