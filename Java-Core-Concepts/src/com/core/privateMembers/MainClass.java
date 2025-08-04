package com.core.privateMembers;

public class MainClass extends Example{

	public static void main(String[] args) {
		
		System.out.println("value of k "+j);
		
		display1();
	}

}


class Example{
	
	
	static private int k = 90;
	static public int j =89;
	
	
	private void display() {
		System.out.println("Test method");
	}
	
	static public void display1() {
		System.out.println("Test method");
	}
}