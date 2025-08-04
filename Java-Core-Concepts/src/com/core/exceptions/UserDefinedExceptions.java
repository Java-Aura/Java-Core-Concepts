package com.core.exceptions;

import java.util.Scanner;

public class UserDefinedExceptions {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter user name:");
			String userName = sc.next();
			if("java".equalsIgnoreCase(userName)) {
				throw new MyException("User found");
			}
			else {
				throw new ArithmeticException("user not found");
			}
			
			
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}

class MyException extends RuntimeException {
	
	MyException(String str){
		super(str);
	}
	
}
