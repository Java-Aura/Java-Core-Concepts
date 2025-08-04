package com.core.cloningObject;

public class DeepCloningObject {

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepClone1 obj = new DeepClone1();
		obj.a = 90;
		obj.b = 12;
		obj.dp.j = 34;
		obj.dp.k = 78;
		DeepClone1 obj2 = (DeepClone1) obj.clone();
		obj2.a = 67; // copied and changes reflected in copied object
		obj2.dp.j = 45; // not copied object of Shallow1 and changes reflected in both the objects

		System.out.println("original object data: " + obj.a + ":" + obj.b + ":" + obj.dp.k + ":" + obj.dp.j);
		System.out.println("copied object data: " + obj2.a + ":" + obj2.b + ":" + obj2.dp.k + ":" + obj2.dp.j);
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}
}

class DeepClone {

	int k;
	int j;
}

class DeepClone1 implements Cloneable {
	int a;
	int b;
	DeepClone dp = new DeepClone();

	public Object clone() throws CloneNotSupportedException {
		
		DeepClone1 dp1 = (DeepClone1)super.clone();
		dp1.dp =  new DeepClone();
		dp1.dp.j= dp.j;
		dp1.dp.k= dp.k;
		return dp1;
	}
}
