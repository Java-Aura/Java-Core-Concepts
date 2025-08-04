package com.core.Object;

public class HashCode {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(2314);
		user.setName("sv");
		
		User user1 = new User();
		user1.setId(2315);
		user1.setName("sp");
		System.out.println(user.hashCode());
		System.out.println(user1.hashCode());

	}

}
