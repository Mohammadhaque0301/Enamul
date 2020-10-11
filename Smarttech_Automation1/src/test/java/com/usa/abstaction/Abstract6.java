package com.usa.abstaction;

public class Abstract6 extends  Abstraction5 {

	@Override
	void getSpeed() {
		// TODO Auto-generated method stub
	System.out.println(" Speed is per mile : 120");	
	}

	@Override
	void getCar() {
		// TODO Auto-generated method stub
		System.out.println("car is Audi");	
	}

	@Override
	void getcolor() {
		
	}
public static void main(String[] args) {
	Abstract6 obj = new Abstract6();
	obj.getSpeed();
	obj.getCar();
}
}
