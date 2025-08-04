package com.core.methods;

import java.util.Scanner;

public class MethodsBasedOnParameter {

	public static void main(String[] args) {

		MethodsTypes obj = new MethodsTypes();
		short num = 12;
		obj.printTable(num, 20);
		/*
		 * obj.printTable(); obj.printTable(10, new int[] { 17, 19 });
		 * obj.printTableVargs(10, 17,19);
		 */

	}

}

class MethodsTypes {

	public void printTable(int num, int lentgh) {

		for (int i = 1; i <= lentgh; i++) {
			System.out.println(num + "*" + i + " = " + num * i);
		}
	}

	public void printTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr number to print tables from methodWithout parameters: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + " = " + num * i);
		}
	}

	public void printTableVargs(int lentgh, int... numbers) {
		for (int num : numbers) {
			for (int i = 1; i <= lentgh; i++) {
				System.out.println(num + "*" + i + " = " + num * i);
			}
		}

	}

	public void printTable(int lentgh, int[] numbers) {
		for (int num : numbers) {
			for (int i = 1; i <= lentgh; i++) {
				System.out.println(num + "*" + i + " = " + num * i);
			}
		}

	}
}