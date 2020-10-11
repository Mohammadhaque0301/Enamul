package com.usa.abstaction;

public class Abstraction4 extends Abstraction3  {

	@Override
	void getspeed() {
		// TODO Auto-generated method stub
	System.out.println("120 per mile");	
	}

	@Override
	public void getcar() {
		// TODO Auto-generated method stub
	System.out.println("lexus");	
	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Abstraction4 obj = new Abstraction4();
	obj.getcar();
	obj.getspeed();
}
}
