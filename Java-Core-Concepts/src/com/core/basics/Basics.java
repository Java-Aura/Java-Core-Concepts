package com.core.basics;

import java.util.Scanner;



public class Basics {

	public static void main(String[] args) {
		 /* <data-type> <variable-name>;*/
		 int i = 23;
		 long l = 23434;
		 BasicsTest obj = new BasicsTest();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first number:");
		 int firstNum = sc.nextInt();
		 System.out.println("Enter second number:");
		 int secondNum = sc.nextInt();
		 obj.sum(firstNum, secondNum);
		 int sumReturn = obj.sumReturn(i, l);
		 System.out.println(sumReturn);
		 

	}

}

 class BasicsTest{
	 int test =0;
	 
	 public void sum(int i, long k) {
		 int sum = (int) (i+k);
		 System.out.println(sum);
	 }
	 
	 public int sumReturn(int i, long k) {
		 int sum = (int) (i+k);
		return sum;
	 }
	
}
