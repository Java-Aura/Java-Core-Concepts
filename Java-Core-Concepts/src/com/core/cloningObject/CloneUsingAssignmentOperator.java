package com.core.cloningObject;

public class CloneUsingAssignmentOperator {

	public static void main(String[] args) {
		
		Clone obj = new Clone();
		System.out.println(obj.k);
		System.out.println(obj.j);
		Clone obj1 = obj; // both object reference are same. i.e referring an object.
		obj1.j=56; // changes will be reflected to original object
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj.j);
	}

}


class Clone{
	
	int k =89;
	int j = 78;
	
}
