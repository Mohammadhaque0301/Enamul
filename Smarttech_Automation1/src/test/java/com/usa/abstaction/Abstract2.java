package com.usa.abstaction;

public class Abstract2 extends  Absrtat1{

	@Override
	public void getspeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getCar() {
		System.out.println(" car is : BMW");
	}
@Override
	void getModel() {
		}
     void getColor() {
		}
   public static void main(String[] args) {
	   Abstract2 obj = new Abstract2();
     obj.getCar();
   
   }   
}
