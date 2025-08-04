package com.core.InnerClass;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			public void display() {
				System.out.println("From child class method");
			}

			public void m1() {
				System.out.println("From method m1");
			}
		};
		parent.display();
		// parent.m1(); // error we can't access

		I1 i1 = new I1() {

			@Override
			public void sum(int k, int j) {
				System.out.println("Sum of variables: " + (k + j));

			}

		};
		i1.sum(12, 45);
		AnonymousInnerClass obj = new AnonymousInnerClass();
		obj.m2(new I2() {
			@Override
			public void sum(int k, int j) {
				System.out.println("From anonymous inner class as method argument:" + (k + j));
			}
		});

	}

	public void m2(I2 i2) {
		i2.sum(34, 29);
	}

}

class Parent {

	int k = 90;

	public void display() {
		System.out.println("From parent class method");
	}
}

interface I1 {

	public void sum(int k, int j);
}

interface I2 {
	public void sum(int k, int j);
}
