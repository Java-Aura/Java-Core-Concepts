package com.core.basics;

import java.util.Date;
import java.util.Scanner;

public class BranchingStatements {

	public static void main(String[] args) {
		
		BranchingStatements obj = new BranchingStatements();

		Date date = new Date();
		String s = String.valueOf(12);
		System.out.println(s);
		System.out.println(date );
		
		obj.printTable();
		
	}
	
	public int getNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table");
		int num = sc.nextInt();
		return num;
	}
	
	public void printTable() {
		int num = getNum();
		for(int i=1;i<=10;i++) {
			System.out.println("value of i = "+i);
			if(i==3)
			{
				continue;
				
			}
			else if(i==2) {
				//System.exit(0);
			}
			System.out.println(num+ "*"+ i + " = "+ num*i);
			if(i==5) {
				break;
			}
			
		}
	}

}
