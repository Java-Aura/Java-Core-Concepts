package com.core.inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Test4 test4 =  new Test4();
		test4.extendFromTest1();
	}

}


class Test1{
	
	public void extendFromTest1() {
		System.out.println("Multilevel inheritance");
	}
}

class Test2 extends Test1{
	
	
	
}

class Test3 extends Test2{
	
	
}

class Test4 extends Test3{
	
	
}