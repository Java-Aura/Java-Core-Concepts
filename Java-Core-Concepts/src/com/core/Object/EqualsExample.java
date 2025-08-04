package com.core.Object;

public class EqualsExample {

	public static void main(String[] args) {
		User user = new User();
		user.setId(2314);
		user.setName("sv");
		
		User user1 = new User();
		user1.setId(2315);
		user1.setName("sv");
		String str1 = "java";
		String str2 = "Java";
		System.out.println(str1.equals(str2));
		System.out.println(str1.toString());
		System.out.println(user.toString());
		
		System.out.println(user.equals(user1));
		user = null;
		System.gc();

	}

}
