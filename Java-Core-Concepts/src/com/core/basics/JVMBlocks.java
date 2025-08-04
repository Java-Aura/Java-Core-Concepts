package com.core.basics;

public class JVMBlocks {
	
	String str = "non-static"; //non-static
	static String str1 = "static"; //static
	static String str2;
	String str3;

	public static void main(String[] args) {
		System.out.println(JVMBlocks.str1);
		JVMBlocks obj = new JVMBlocks(); // create object to access non-static members
		System.out.println(obj.str);
		obj.method1();
		JVMBlocks.method2();
		
		/* System.out.println(obj.str1); */
		//obj.method2(); //should be accessed in a static way because method2 is the static method.
		//System.out.println(JVMBlocks.str); need to access in a non-static way i.e by object
		
	}
	
	public void method1() {
		int k = 34;
		int j;
		System.out.println("From non-static"+k);
		
	}
	
	static public void method2() {
		int k = 35;
		int j;
		System.out.println("From static"+k);
	}

}
