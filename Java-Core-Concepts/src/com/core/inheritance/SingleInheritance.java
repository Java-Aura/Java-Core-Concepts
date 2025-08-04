package com.core.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Two two = new Two();
		two.display();
	}
}

class One {
	
	protected void display() {
		System.out.println("From class One and display method");
	}
	
}

class Two extends One{
	
	
}
