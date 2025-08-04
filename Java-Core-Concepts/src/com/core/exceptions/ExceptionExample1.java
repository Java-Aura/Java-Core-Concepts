package com.core.exceptions;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {

		new TestExecption().display();
	}

}

class TestExecption{
	
	String str = "tEST";
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input");
		
	try {
		try {
			int input = sc.nextInt();
			System.out.println(input);
		} catch (Exception e) {
			System.out.println("Exception while printing user input");
		}
		System.out.println(str.toLowerCase());
	}
	catch (Exception e) {
		System.out.println("Exception while printing str");
	}
	finally {
		sc.close();
		System.out.println("Finally block");
	}
		System.out.println("Method excution completed");
	}
	
	
}
