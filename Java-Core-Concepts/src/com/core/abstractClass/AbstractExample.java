package com.core.abstractClass;

import java.util.Scanner;

public class AbstractExample {

	public static void main(String[] args) {
		
		SuperClass obj = new ChildClass();
		obj.display();
		obj.sum(12, 12);
		obj.finalMethod();
		SuperClass.staticMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text:");
		new ChildClass(sc.nextLine());
	}

}


abstract class SuperClass{
	
	Test obj =  new Test(); // this is called as object of Test class
	Test obj1; // this is called as reference of Test class.
	
	/* Default constructor */
	SuperClass(){
		System.out.println("Abstract class default constructor");
	}
	
	SuperClass(String str){
		System.out.println("From abstract class constructor: "+ str);
	}
	
	abstract public void display();
	public void sum(int i, int j) {
		System.out.println("Sum of variables is : "+ (i+j));
	}
	
	{
		System.out.println("From instance block");
	}
	static {
		System.out.println("From static block");
	}
	
	public final void finalMethod(){
		System.out.println("From final method");
	}
	
	public static void staticMethod() {
		System.out.println("From static method");
	}
}


class ChildClass extends SuperClass{
	
	ChildClass(){
		
	}
	ChildClass(String str){
		super(str);
		
	}

	@Override
	public void display() {
		System.out.println("Display from child class");
	}
	
	@Override
	public void sum(int i, int j) {
		System.out.println("Sum of variables is from child class: "+ (i+j));
	}
	// can't override final methods
	/*
	 * public final void finalMethod(){ System.out.println("From final method"); }
	 */
	
}

class Test{
	Test(){
		System.out.println("test class constructor");
	}
}
interface I1{
	Test obj =  new Test();
	public void display();
	
}