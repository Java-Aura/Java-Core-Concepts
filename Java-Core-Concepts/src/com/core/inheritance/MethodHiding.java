package com.core.inheritance;

public class MethodHiding {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		ChildClass.display();
		obj.instanceMethod();
	}

}

class ParentClass {

	static public void display() {
		System.out.println("From parent class static method");
	}

	public void instanceMethod() {
		System.out.println("From parent class instance method");
	}

}

class ChildClass extends ParentClass {

	static public void display() {
		System.out.println("From child class static method");
	}

	public void instanceMethod() {
		System.out.println("From child class instance method");
	}
}