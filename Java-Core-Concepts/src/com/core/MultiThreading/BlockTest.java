package com.core.MultiThreading;

public class BlockTest {

	public static void main(String[] args) {

		Print1 p = new Print1(12);
		Print1 p1 = new Print1(13);
		p.start();
		p1.start();
	}

}

class Print1 extends Thread{
	
	Integer num;
	
	public Print1(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		synchronized (num) {
			for (int k = 1; k <= 10; k++) {
				System.out.println(num + "*" + k + " = " + (num * k));
			}
			
		}
	}
	
}