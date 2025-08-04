package com.Object;

public class ObjectExample {
	public static void main(String[] args) {
		
		Object1 obj = new Object1();// creating object
		System.out.println(obj.str);
		System.out.println(obj.str2);
		System.out.println(obj.str4);
		obj.display();
	}

}

class Object1{
	
	// states of the class
	String str = "default";
	public String str2 = "public";
	private String str3 = "private";
	protected String str4 = "protected";
	
	//behaviour 
	void display() {
		
		System.out.println("I'm behaviour of the class");
	}
	
	
}
