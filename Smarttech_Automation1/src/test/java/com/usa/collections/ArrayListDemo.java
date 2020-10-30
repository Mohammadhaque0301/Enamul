package com.usa.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListDemo {
	

	
		// How to declare arrayList 
		public static void ArrayListTest() {
			// This is java 1.6 non generic code
			List<Integer> num = new  ArrayList();
			num.add(10);
			num.add(20);
			num.add(30);
			num.add(40);
			num.add(50);
			num.add(60);
			System.out.println(num.size());
			System.out.println(num.get(3));
			
			for (int i = 0; i < num.size(); i++) { // i j k
				System.out.println(num.get(i));
			}
			
		}
		
		
		public static void ArrayListStringTest() {
			// This is java 1.6 non generic code
			List<String> num = new ArrayList<>();
			num.add("Selenium");
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
			num.add("Appache POI"); // Increases size 50%
			num.add(null);
			num.add(null);
			num.add(null);
			num.add(null);
			// How to remove specific value 
			num.remove("Java");
			System.out.println(num);
		    //How to remove duplicate value 
			num = num.stream().distinct().collect(Collectors.toList());
			System.out.println(num);
			
			System.out.println(num.size());
			System.out.println(num.get(3));
			
			for (int i = 0; i < num.size(); i++) { // i j k
			System.out.println(num.get(i));
			}
			
		}
}
