package com.core.constructors;

public class ConstructorExample {

	ConstructorExample() {
		System.out.println("Zero-arguments constructor");
	}

	ConstructorExample(int i) {
		System.out.println("arguments constructor:" + i);
	}

	ConstructorExample(String name, int age) {
		System.out.println("arguments constructor:\n" + "Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {

		ConstructorExample constructorExample = new ConstructorExample(); // Zero-arguments constructor
		ConstructorExample constructorExample1 = new ConstructorExample(12); // arguments constructor
		ConstructorExample constructorExample2s = new ConstructorExample("TestName", 18); // arguments constructor

	}

}
