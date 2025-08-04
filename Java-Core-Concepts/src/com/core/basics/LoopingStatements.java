package com.core.basics;

import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table");
		int num = sc.nextInt();
		System.out.println("printing table from for loop");
		for(int i=1;i<=10;i++) {
			System.out.println(num+ "*"+ i + " = "+ num*i);
		}
		int arr[] = new int[] {12,23,45};
		int arr1[] = new int[] {512,235,453};
		
		//traditional for loop  iterate specific values
		for(int k= 0; k<2;k++) {
			System.out.println(arr[k]);
		}
		// enhanced for loop iterate all values
		for(int j: arr1) {
			System.out.println(j);
		}
		
		int n=1;
		System.out.println("printing table from while loop");
		while(n<=10) {
			
			System.out.println(num+ "*"+ n + " = "+ num*n);
			n++;
		}
		
		System.out.println("printing table from  do while loop");
		System.out.println("value of n after while loop execution = "+ n);
		
		while(n<=10) {
			
			System.out.println(num+ "*"+ n + " = "+ num*n);
			n++;
		}
		
		do {
			System.out.println(num+ "*"+ n + " = "+ num*n);
			n++;
		}
		while(n<10);
		
		do {
			System.out.println(num+ "*"+ n + " = "+ num*n);
			n++;
		}
		while(n<=20);
				

	}

}
