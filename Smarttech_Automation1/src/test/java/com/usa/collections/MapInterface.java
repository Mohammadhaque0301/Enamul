package com.usa.collections;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class MapInterface {
	// How to handle the data structure?
		// Ans- Help with Map interface also we can handle with LinkedList

		// Map is an interface
		// Implemented class HashMap, HashTable LinkedHashMap
		// Map store the value key & value pair
		// Map allow only one null key and many null value
		// dose not maintain the insertion order

		// id - Alam
		// id - Alam
		// id - Alam
		// id - Alam
		// id - Alam

		public static void main(String[] args) {
			Map<Integer, String> name = new HashMap<>();
			name.put(1, "Alam");
			name.put(2, "Alam");
			name.put(3, "Alam");
			name.put(4, null);// Map allow multiple duplicate value 
			name.put(5, null);
			name.put(5, null);// dose not allow duplicate key
			name.put(null, null);
			name.put(null, null);// dose not allow more than one null key

			for (java.util.Map.Entry<Integer, String> m : name.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}

		}

	}

