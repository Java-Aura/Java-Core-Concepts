package com.core.exceptions;

import java.util.Scanner;

public class ThrowsKeyword {

	public static void main(String[] args) {
new Throws().readUserNameAndAge();
	}

}


class Throws{
	
	public void validateUser(String userName ,int age) throws InterruptedException , NullPointerException,ArithmeticException
	{
		//userName = null;
		if("java".equalsIgnoreCase(userName.toLowerCase())) {
			
			Thread.sleep(1000);
			int a =90;
			int b =0;
			System.out.println(a/b);
			if((int)age > 18) {
				System.out.println("valid user");
			}
		}
	}
	
	public void readUserNameAndAge() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter user name:");
			String userName = sc.nextLine();
			System.out.println("Enter age:");
			String age = sc.nextLine();
			validateUser(userName, Integer.valueOf(age));
		} catch (NumberFormatException | NullPointerException | ArithmeticException | InterruptedException e) {
			System.out.println(e.toString());
		}
		finally {
			sc.close();
		}
		
				
	}
}