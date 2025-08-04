package com.core.MultiThreading;

public class CreatingThreadUsingAICAsImplementaionClass {
	public static void main(String[] args) {
		int num =78;
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int k =1; k<=10;k++) {
					System.out.println(num+"*"+k +" = "+ (num*k));
				}
				
				
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
