package com.usa.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterFace {

	// Set is an interface
	// Set interface implemented Hash set, LikedHashset, tree set
	// Set dose not allow duplicate value
	// Set dose not maintains the insertion order
	// Set allow only one null value
	// Set you cannot find the index value

	public static void setTest() {

		Set<String> name = new HashSet<>();
		name.add("Selenium");
		name.add("Java");
		name.add("Java");
		name.add("Cucumber");
		name.add("TestNG");
		name.add("Jenkins");
		name.add("Git-Hub");
		name.add("Selenium"); // ny , ny squer,
		name.add(null);
		name.add(null);
		name.add(null);
		System.out.println(name);
		// System.out.println("Contains : "+name.contains("Cucumber"));

	}
        public static void main(String[] args) {
	           setTest();
}
}


