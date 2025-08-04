package com.core.privateMembers;

public class PrivateConstructor {

	public static void main(String[] args) {
		
		Test.getObject().m2();
		Test.getObject().m2();
	}

}


class Test {
	
	private static Test test= null;
	
	private Test() {
		
	}
	
	
	public static Test getObject() {
		
		if(test == null) {
			test = new Test();
		}
		System.out.println(test.hashCode());
		return test;
		
	}
	
	
	public void m2() {
		System.out.println("From singleton class");
	}
	
}