package com.core.privateMembers;

public class PrivateClass {

	public static void main(String[] args) {
		new BaseClass().m1();

	}

}

 class BaseClass{
	
	private class InnerClass{
		int k =89;
	}
	
	InnerClass obj = new InnerClass();
	
	public void m1() {
		System.out.println(obj.k);
	}
}