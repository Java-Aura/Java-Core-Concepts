package com.core.exceptions;

import java.util.Scanner;

public class JVMSearchesCallStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String str = sc.nextLine();
		str = null;
		JVMCallStack obj = new JVMCallStack();
		String replaceSpecialCharsAndLoweCaseString = obj.replaceSpecialCharsAndLoweCaseString(str);
	System.out.println(replaceSpecialCharsAndLoweCaseString);
	}

}

class JVMCallStack{
	
	
	public String lowerCaseString(String str) {
		
		try {
			str = str.toLowerCase();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException "+ e.getMessage());
		}
		return str;
	}
	
	public String replaceSpecialCharsAndLoweCaseString(String str)
	{
		String lowerCaseString = "";
		try {
			//str = str.replaceAll("[^a-zA-z]", "");
			lowerCaseString = lowerCaseString(str);
			
		} catch (NullPointerException e) {
		System.out.println("NullPointerException- " + e.getMessage());
		}
		return lowerCaseString;
	}
	
}
