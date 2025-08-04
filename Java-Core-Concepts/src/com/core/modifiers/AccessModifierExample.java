package com.core.modifiers;

public class AccessModifierExample {

	public static void main(String[] args) {
	
		Test obj = new Test();
		//System.out.println(obj.k);
		System.out.println(obj.j);

	}

}

 class Test{
	
	private int k = 90;
	 int j = 30;
	 void display() {
		 System.out.println(k);
		
	}
	 private class InnerClass{
		 
	 }
}
