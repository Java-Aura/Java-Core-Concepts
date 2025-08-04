package com.core.MultiThreading;

public class CreatingThreadAICAsClassExtension {

	public static void main(String[] args) {
		int num = 23;
		 Thread t = new Thread() {
			 @Override
				public void run() {
						for(int k =1; k<=10;k++) {
							System.out.println(num+"*"+k +" = "+ (num*k));
						}
					
				}
		 };
		 t.start();
	}

}
