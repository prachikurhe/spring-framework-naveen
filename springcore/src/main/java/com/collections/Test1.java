package com.collections;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test1 {
	private Vector fruits;
	private  TreeSet cricketers;
	private Hashtable cc;
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	
	public void printData() {
		System.out.println("Fruits....");
		for(Object fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("Cricketers...");
		for(Object cricketer:cricketers) {
			System.out.println(cricketer);
		}
		Set keys=cc.keySet();
		for(Object key:keys) {
			System.out.println("country:"+key+"capital"+cc.get(key));
		}
	}
	
	
	

}
