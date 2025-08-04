package com.core.objectTypes;

public class MutableObjects {

	public static void main(String[] args) {
		
		Example1 obj1 = new Example1();
		obj1.h =56;
		
		Example2 obj2 = new Example2();
		System.out.println(obj2.getM1());
		System.out.println(obj2.getK());
	}

}


class Example1{
	
	int h = 78;
	
	
}

final class Example2{
	
	private final int k = 67;
	
	private final String m1() {
		return "Java";
	}
	
	public String getM1() {
		return m1();
	}
	
	public int getK() {
		return k;
	}
	
}