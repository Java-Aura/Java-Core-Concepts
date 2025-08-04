package com.core.finalKeyword;

public class FinalExample {

	public static void main(String[] args) {
	
		Final1 obj = new Final1();
		obj.display();
		Final obj1 = new Final();
		System.out.println(obj1.str);
	}

}

 final class Final{
	String str = "Java";
}


/* class Final1 extends Final{ */ // gives error as Final is the final class
class Final1 {
	final int k = 30;
	public void display() {
		// k = 67; // re-assign and can't be done decause it's a final
		
		System.out.println("value of k: "+(k)+30); // here changing value
		
	}
	
	final public void finalMethod() {
		System.out.println("From final method");
	}
	
}


class Final2 extends Final1{
	/* 
	public void finalMethod() {
		System.out.println("From final method");
	}
	can't override final method
	*/
}
