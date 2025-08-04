package com.core.MultiThreading;

public class CreatingThreadUsingRunnable {

	public static void main(String[] args) {
		RunnableTest r1 = new RunnableTest(14);
		Thread t1 = new Thread(r1);
		t1.start();

	}

}


class RunnableTest implements Runnable{
	int num ;
	RunnableTest(){
		
	}
	RunnableTest(int num){
		this.num = num;
	}
	@Override
	public void run() {
		for(int k =1; k<=10;k++) {
			System.out.println(num+"*"+k +" = "+ (num*k));
		}
		
	}
	
}