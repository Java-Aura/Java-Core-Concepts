package com.core.polymorphism;

import java.util.Scanner;

public class MethodOverLoading {
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = input.nextInt();
		OverloadedMethods obj = new OverloadedMethods();
		obj.printTable(num);
		System.out.println("Enter number to print table based on length:");
		int num1 = input.nextInt();
		System.out.println("Enter length:");
		int length = input.nextInt();
		obj.printTable(num1, length);
		System.out.println("Enter number to print table based on length and message:");
		int num2 = input.nextInt();
		System.out.println("Enter length:");
		byte length1 = input.nextByte();
		System.out.println("Enter mssage to display:");
		String message = input.next();
		obj.printTable(num2, length1, message);
	}
}


class OverloadedMethods{
	
	
	public void printTable(int num) {
		for(int i =1; i<=10;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}

	public void printTable(int num, int length) {
		for(int i =1; i<=length;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}
	
	public void printTable(int num, byte length) {
		for(int i =1; i<=length;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}
	
	public void printTable(int num, byte length,String message) {
		System.out.println("Message from user:" + message);
		for(int i =1; i<=length;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}
}