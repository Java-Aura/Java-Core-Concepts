package com.core.TypeConversion;

public class MainClass {

	public static void main(String[] args) {
		
		
		int k = 14;
		long l = k; // implicit conversion
		byte b = (byte) l; // explicit conversion
		
		/*
		 * boolean bool = false; int j = (int)bool;
		 */
		
		char c = 'A';
		int h = (int)c;
		System.out.println(b);
		
		Parent parent = new Child(); // implicit conversion
		Child child  =  (Child)new Parent(); // explicit conversion
		
	}

}

class Parent{
	
}


class Child extends Parent{
	
}