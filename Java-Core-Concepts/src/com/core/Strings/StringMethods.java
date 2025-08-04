package com.core.Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String mailId = "svchar4@gmail.com";
		
		String str1 = "java";
		String str2 ="Java";
		String str3 = "java";
		String str = "String MetHods ExaMple";
		System.out.println(str.toLowerCase()); //to convert into lower case
		System.out.println(str.toUpperCase()); //to convert into upper case
		System.out.println(str.charAt(2)); // to get character at specified index.
		System.out.println(str.replace("e", "s")); // to replace single or multiple characters with specified characters
		System.out.println(str.replace("MetHods", "class methods"));// to replace single or multiple characters with specified characters
		System.out.println(str1.equals(str2));// exact match with specified String object
		System.out.println(str1.equals(str3));// exact match with specified String object
		System.out.println(str1.equalsIgnoreCase(str2));// ignore case while comparing String objects.
		System.out.println(str.replaceFirst("e", "k")); // replace only first occurance of the String 
		System.out.println(str.endsWith("s")); // to check whether the string ends with specified String/character or not.
		
		for(int k =0; k<str.length(); k++) { // here length is for finding length of the String.
			System.out.println(str.charAt(k));
		}
		//IntStream chars = str.chars();
		
		System.out.println(str.indexOf("g")); // get index number of specified char/string
		System.out.println(str.indexOf("e"));// get index number of specified char/string
		System.out.println(str.lastIndexOf("e")); // get last index number of specified char/string
		if(mailId.endsWith("gmail.com")) {
			System.out.println("It's the gmail account");
		}
	}

}
