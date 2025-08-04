package com.core.abstraction;

public class Interface {

	public static void main(String[] args) {

		IMPL1 obj = new IMPL1();
		obj.display();
		//I1 obj1 = new I1();// we can't create object for interface
		I1 obj1 = new IMPL1();
		obj1.display();
		System.out.println(obj1.k);//The static field I1.k should be accessed in a static way
		System.out.println(I1.k);
	}

}


interface I1{
	
	public void display();
	int k = 89;
	
	
}

class IMPL1 implements I1{

	@Override
	public void display() {
		System.out.println("Display from IMPL1");
		
	}
	
}