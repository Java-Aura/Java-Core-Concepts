package com.core.basics;

public class JVMExample {

	static int i =45;
	static String str = "java";
	int j = 90;
	public static void main(String[] args) {
		JVMExample obj = new JVMExample();
		System.out.println("value of i: "+i);
		System.out.println(obj.j);
		obj.method1();
		System.out.println(obj.hashCode());
	}
	
	public void method1() {
		int k =23;
		System.out.println("value of K = "+k);
	}
	
	public static void methodStatic() {
		int d =34;
		System.out.println("value of d  = "+d);
	}

}
