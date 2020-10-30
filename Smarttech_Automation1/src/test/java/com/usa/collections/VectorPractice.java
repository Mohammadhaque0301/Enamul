package com.usa.collections;

import java.util.Vector;

public class VectorPractice {

	public static void vectorTest() {
		
		Vector<String> num = new Vector<String>();
		
		num.add("selenium");
		num.add("Java");
		num.add("Maven");
		num.add("Cucumber");
		num.add("TestNG");
		num.add("GitHub");
		num.add("Jenkins");
		num.add("JDBC");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		num.add("Appache POI");
		// Increases size 100%
		System.out.println("Index of jenkins "+ num.indexOf("Jenkins"));
		
		if (num.contains("Jenkins"))
			System.out.println("Jenkins is exists");
		else
			System.out.println("Jenkins is not exists");
		
		num.clear();
		System.out.println(num);
		for (int i = 0; i < num.size(); i++) { // i j k
			System.out.println(num.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		      vectorTest();
		
		
	}
}

