package com.usa.incapsulation; 

public class IncapsulationA {

	private String Name = "Mohammad Haque";
	private String Profesion = "student";
	private int Age = 35;
	
	public String getName() {
		return Name;
	}
	public String getProfesion() {
		return Profesion;
	}
	public int getAge() {
		return Age;
	}
	public static void main(String[] args) {
		 IncapsulationA obj = new  IncapsulationA();
		 obj.getName();
	  System.out.println("  name : Mohammad Haque ");
		 obj.getProfesion();
		 System.out.println("  profesion : Student");
		 obj.getAge(); 
	  System.out.println("  Age is : 35");
	  
	  
	}	
}
