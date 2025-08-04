package com.core.modifiers;

public class Protected {
	
	protected String str= "I'm Protected";

	void display() {
		System.out.println("From protected class");
	}
	
	public void display2() {
		System.out.println("From protected class");
	}
	
	protected void display1() {
		System.out.println("From protected class from protected method");
	}
}
