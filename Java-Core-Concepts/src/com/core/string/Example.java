package com.core.string;

public class Example {

	public static void main(String[] args) {
		
		String str = "Java";
		str.concat("String"); // modification of string these changes will not be reflected
		str = str.concat("test"); // re- assignment String and  these changes will be reflected
		
		
		String str2 = new String("String");
		str2.concat("java");// modification of string these changes will not be reflected
		str2 = str2.concat("javatest"); // re- assignment of String and  these changes will be reflected
		
		String str1 = "Java";
		String str4 = "Java";
		
		String str3 = new String("String");
		String str5 = new String("String");
		System.out.println(str1==str4);
		System.out.println(str3==str5);
		
		String intern1 = "java";
		String intern2 =new String("java");
		System.out.println("intern1: "+intern1.hashCode());
		System.out.println("intern2: "+intern2.hashCode());
		
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str);
		System.out.println(str2);

	}

}
