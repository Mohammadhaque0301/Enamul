package com.usa.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDuolicate {
	
	public static void duplicateValue() {
		String[] duplicate = { "Selenium", "Java", "Maven", "Cucumber", "TestNG", "Java" };
		Set<String> name = new HashSet<>();
		
		for (String value : duplicate) {
			if (name.add(value) == false) {
				System.out.println("Duplicate value is a : " + value);
			}
		}
	}

	public static void main(String[] args) {
		duplicateValue();
	}
}

