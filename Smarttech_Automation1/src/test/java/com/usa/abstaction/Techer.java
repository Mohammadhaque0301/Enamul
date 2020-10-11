package com.usa.abstaction;

public interface Techer {
	
	void getName();
    void getAge();
    default void getSalary() {
}
}