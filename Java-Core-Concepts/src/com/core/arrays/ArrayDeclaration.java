package com.core.arrays;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int []arr = new int[12];
		int []arr1 = new int[]{12,23,24};
		int []arr2 = {121,45,6,8};
		
		arr = arr2; // array copy
		int []arr3  = new int[3];
		
		
		
		String []strArr = new String[12];
		String []strArr1 = new String[] {"s","p"};
		String []strArr2 = {"Sv","Sp"};
		System.out.println(arr1.toString());

		for(int k =0;k<arr1.length;k++) {
			System.out.print(arr1[k]+",");
		}
		System.out.println();
		for(int k : arr) {
			System.out.print(k+",");
		}
		arr[2]= 78;
		System.out.println();
		for(int k : arr) {
			System.out.print(k+",");
		}
		System.out.println();
		for(String str : strArr1) {
			System.out.print(str+",");
		}
		System.arraycopy(arr, 1, arr3, 0, 3);
		System.out.println();
		for(int k : arr3) {
			System.out.print(k+",");
		}
		System.out.println();
		User [] user = new User[3];
		User user1 = new User("User1");
		User user2 = new User("User2");
		User user3 = new User("User3");
		user[0]= user1;
		user[1]= user2;
		user[2]= user3;
		
		//user[3]= user3;// Will raise java.lang.ArrayIndexOutOfBoundsException
		
		for(User users : user) {
			System.out.println(users.getName());
		}
		System.out.println();
		Object []object = new Object[4]; // non-similar data we can store but while iterating we need handle it
		object[0]= user1;
		object[1]= user2;
		object[2]= user3;
		object[3]= "TestString";
		for(Object obj : object) {
			if(obj instanceof User)
			System.out.println(((User)obj).getName());
			else
				System.out.println(obj.toString());
		}
		
		
		int [][] arrTwoDimention= {{12,14},{34,56}};
		System.out.println(arrTwoDimention[0].length);
		System.out.println(arrTwoDimention[1].length);
		for(int k =0;k<arrTwoDimention.length;k++) {
			for(int j =0;j<arrTwoDimention[k].length;j++) {
				System.out.print(arrTwoDimention[k][j]+",");
			}
		}
	}

}
class User{
	
	
	public String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
