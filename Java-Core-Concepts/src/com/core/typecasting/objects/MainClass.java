package com.core.typecasting.objects;

public class MainClass {

	public static void main(String[] args) {


		BaseClass obj = new SubClass();// generalization
		obj.display("Test");
		obj.display1();
	}

}


class BaseClass{
	public void display(String str) {
		System.out.println("Display from base class: "+ str);
	}
	
	public void display1() {
		System.out.println("display1 from base class");
	}
	
}

class SubClass extends BaseClass{
	public void display(String str) {
		System.out.println("Display from sub class: "+ str);
	}
	
	
}