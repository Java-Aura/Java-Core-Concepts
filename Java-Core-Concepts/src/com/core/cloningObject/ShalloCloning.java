package com.core.cloningObject;

public class ShalloCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Shallo2 obj = new Shallo2();
		obj.a = 90;
		obj.b = 12;
		obj.sh.j = 34;
		obj.sh.k = 78;
		Shallo2 obj2 = (Shallo2)obj.clone();
		obj2.a =67; // copied and changes reflected in copied object
		obj2.sh.j =45; // not copied object of Shallow1 and changes reflected in both the  objects
		
		System.out.println("original object data: " + obj.a + ":" + obj.b + ":" + obj.sh.k + ":" + obj.sh.j);
		System.out.println("copied object data: " + obj2.a + ":" + obj2.b + ":" + obj2.sh.k + ":" + obj2.sh.j);
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}

}

class Shallow1{
	
	int k;
	int j;
}


class Shallo2 implements Cloneable
{
	int a;
	int b;
	Shallow1 sh = new Shallow1();
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
}