package com.core.Strings;

public class StringWaysOfCreation {
	
	public static void main(String[] args) {
		
		
		String str = "java"; // using literal
		String str1 = "java";
		String str2 = "Java";
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println(str==str1);
		System.out.println(str==str2);
		String str3 = new String("java"); // two objects within in heap and scp
		String str4 = new String("java"); // one object created within in heap and reference returned from scp as java is already existed.
		 // two objects will be created one is in heap area and one is in SCP and reference points to heap area object.
		String str5 = str4.intern(); // moving or pointing reference from SCP
		String str6 = "java";
		System.out.println(str5==str6);
		
	}

}
