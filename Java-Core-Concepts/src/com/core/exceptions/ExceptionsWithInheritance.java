package com.core.exceptions;

public class ExceptionsWithInheritance {

	public static void main(String[] args) throws Exception {
		
		Parent parent = new Child(); // creating object with generalization
		parent.m1();
	}

}


class Parent{
	
	public void m1()throws Exception {
		System.out.println("From parent");
	}
	
	public void m2() {
		System.out.println("From child");
	}
}

class Child extends Parent{
	
	@Override
	public void m1()throws InterruptedException{
		System.out.println("From child");
	}
	
	@Override
	public void m2()throws RuntimeException {
		System.out.println("From child");
	}
}