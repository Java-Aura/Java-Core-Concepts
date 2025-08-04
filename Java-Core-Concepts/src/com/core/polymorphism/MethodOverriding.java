package com.core.polymorphism;

import java.util.Scanner;

import com.core.inheritance.ProtectedMembers;

public class MethodOverriding {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.printTable(23);
		Child child = new Child();
		child.printTable(12);
		Parent parent1 = new Child();
		//System.out.println(parent1.k);// parent class reference can access only parent class variables.
		parent1.display();
	
	}

}


class Parent extends ProtectedMembers{
	
	int j =89;
	
	protected void printTable(int num) {
		System.out.println(protectedMessage);
		// System.out.println(defaultMessage); can't be accessed as the variable is default one
		for(int i =1; i<=10;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}
	
	public void display() {
		System.out.println("I'm from parent class..!");
		
	}
	
}

class Child extends Parent{
	
	int k =90;
	
	public void printTable(int num) {
		System.out.println("Enter length: ");
		Scanner sc = new Scanner(System.in);
		int lenth = sc.nextInt();
		for(int i =1; i<=lenth;i++) {
			System.out.println(num+" X "+i + " = "+num*i);
		}
	}
	
	public void display() {
		System.out.println("I'm from child class..!");
		
	}
}

