package com.core.basics;

import java.util.Scanner;

public class ConditionlStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
	
		/*Conditional statements:*/
		if(age>=18) {
			System.out.println("User can able to vote");
		}
		else if(age>=17 && age<18) {
			System.out.println("User has to wait for one more year");
		}
		//nested else if
		else if(age<16) {
			System.out.println("User is a child");
			
		}
		else {
			System.out.println("User can't vote");
		}
		
		//nested if
		
		if(age>18) {
			System.out.println("nested age greater than 18");
		}
		if(age>=18) {
			System.out.println("nested age greater than or equals to 18");
		}
		if(age<18) {
			System.out.println("nested age less than 18");
		}
		switch (age) {
		case 18: 
				System.out.println("switch case: user can vote");
				break;
		case 17:
			System.out.println("switch case: user has to wait for one more year");
			break;
		case 15:
			System.out.println("switch case: user is a child");
			break;
		default:
			System.out.println("none of the case satisfied");
		}
		
	}

}
