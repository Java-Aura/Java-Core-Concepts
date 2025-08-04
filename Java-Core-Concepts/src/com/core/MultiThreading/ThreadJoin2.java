package com.core.MultiThreading;

public class ThreadJoin2 {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int k =0 ; k<3; k++) {
					System.out.println("value from t1 : "+k);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int k =0 ; k<3; k++) {
					System.out.println("value from t2: "+k);
				}
			}
		};
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
