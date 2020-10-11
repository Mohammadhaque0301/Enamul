package com.usa.inheritance1;

public class Son extends Father  {

    protected void name()	{
	String name ="Araf";
    System.out.println(name);
     }
	public static void main(String[] args) {
		Son obj = new Son();
	     obj.address();
		 obj.name();

}	

}
