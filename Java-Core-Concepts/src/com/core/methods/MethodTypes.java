package com.core.methods;

import java.util.Scanner;

public class MethodTypes {

	public static void main(String[] args) {
		Methods.printTableByStaticMethod();
		Methods methods = new Methods(); // creating object
		System.out.println(methods.hashCode());
		methods.printTableByNonStaticMethod();
		

	}

}


class Methods{
	
	int k = 90;
	static int j =89;
	public void printTableByNonStaticMethod() {
		System.out.println("value of k = "+k);
		System.out.println("value of j = "+j);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table from non-static method");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}
	
	public static void printTableByStaticMethod() {
		//System.out.println("value of k = "+k);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table from static method");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+num*i);
		}
	}	
	
	
}	
	