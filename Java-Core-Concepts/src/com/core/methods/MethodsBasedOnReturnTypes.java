package com.core.methods;

import java.util.Scanner;

public class MethodsBasedOnReturnTypes {

	public static void main(String[] args) {
		
		ReturnTypeMethods obj = new ReturnTypeMethods(); // object created
		obj.methodWithoutReturnType();
		long num = obj.getNumberToPrintTable();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}

}

class ReturnTypeMethods{
	
	
	public int getNumberToPrintTable() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to print tables: ");
		int num = sc.nextInt();
		return num;
		
	}
	
	public void methodWithoutReturnType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to print tables from methodWithoutReturnType: ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}
}