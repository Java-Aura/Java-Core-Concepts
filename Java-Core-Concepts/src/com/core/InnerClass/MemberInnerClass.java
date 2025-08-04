package com.core.InnerClass;

public class MemberInnerClass {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.obj.display1();
		obj.obj1.display1();
	}

}


class InnerClass{
	
	int k =90;
	static int j = 89;
	 
	public void dis() {
		System.out.println("Display from outer class non-static method");
	}
	
	static public void dis1() {
		System.out.println("Display from outer class static method");
	}
	
	class InnerNonStatic{
		
		int g =90;
		//static int d = 78;
		public void display1() {
			dis();
			dis1();
		}
		
	}
	
	
	static class InnerStatic{
		int d = 90;
		static int f = 78;
		
		public void display1() {
			dis1();
		}
		
	}
	InnerNonStatic obj = new InnerNonStatic();
	InnerStatic obj1 = new InnerStatic();
	
}
