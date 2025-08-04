package com.core.blocks;

public class NonStaticBlock {

	public static void main(String[] args) {
		
		System.out.println(Blocks.str);
		new Blocks();
		/*
		 * new Blocks(); new Blocks();
		 */

	}

}

class Blocks{
	static String str = "Static String";
	static String str1;
	String str2 ="NonStatic String";
	String str3;
	
	{
		str1 = "I'm static but initialized from non-static block";
		str3 = "initialzed from non-static block";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1);
		
	}
	
	{
		System.out.println("second non-static block");
		str1 = "I'm static but initialized from non-static block";
		str3 = "initialzed from non-static block";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1);
		
	}
	
}