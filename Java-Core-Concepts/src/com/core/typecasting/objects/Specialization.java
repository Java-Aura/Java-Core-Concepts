package com.core.typecasting.objects;

public class Specialization {

	public static void main(String[] args) {
		
		ChildClass obj = (ChildClass) new SuperClass(); // Specialization
		SuperClass obj1 = new ChildClass(); // generalization
	}

}


class SuperClass{
	
	int d = 78;
}


class ChildClass extends SuperClass{
	int j = 90;
}