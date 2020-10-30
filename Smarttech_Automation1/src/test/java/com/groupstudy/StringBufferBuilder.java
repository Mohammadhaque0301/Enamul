package com.groupstudy;

public class StringBufferBuilder {
	// What is a String? 
		// Why String is a immutable?
		// When we declare the value we cannot change it 
		
		// StringBuffer & StringBuider
		
	    // StringBuffer is a mutable class & synchronized
		// StringBuider is a mutable class & not synchronized
		
		public static void stringImutable() {
			// Why String is a immutable?	
			String name = "Smarttech";
			       name = "Inc";
			       name = "Alam";
			       System.out.println(name);
			
		}
		public static void string1() {
		String obj = new String("UPS ");
		       obj.concat("COMPANY");
		       System.out.println("I am a String class : "+obj);
	}
		
		public static void stringBuffer() {
			StringBuffer obj = new StringBuffer("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuffer class : "+obj);
		}
		
		public static void stringBuilder() {
			StringBuilder obj = new StringBuilder("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuilder class : "+obj);
		}
		
		public static void main(String[] args) {
			string1();
			stringBuffer();
			stringBuilder();
		}
	}





