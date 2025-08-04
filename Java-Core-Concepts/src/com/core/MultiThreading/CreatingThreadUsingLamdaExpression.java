package com.core.MultiThreading;

public class CreatingThreadUsingLamdaExpression {

	public static void main(String[] args) {
		
		int num =56;
		Runnable r = ()->{
			for(int k =1; k<=10;k++) {
				System.out.println(num+"*"+k +" = "+ (num*k));
			}
		};

		Thread t = new Thread(r);
		t.start();
	}

}
