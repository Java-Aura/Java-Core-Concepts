package com.core.basics;

class Message{
	String msg;
	boolean flag=false;
	synchronized void send(String msg) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.msg=msg;
		flag=true;
		System.out.println("data sent is :"+ msg);
	}
	synchronized String receive() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("data received is : "+msg);
		flag=false;
		notify();
		return msg;
	}
}

class Thread1 extends Thread{
	Message m;
	
	Thread1(Message m){
		this.m=m;
	}
	@Override
	public void run() {
		
		String []st = {"sv","sp","sm"};
		for(String s : st) {
			m.send(s);
		}
		
	}
}

class Thread2 extends Thread{
	Message m;
	Thread2(Message m){
		this.m=m;
	}
	@Override
	public void run() {
		
		for(int i=0;i<3;i++) {
			m.receive();
		}
	}
}

public class TCEx1 {

	public static void main(String[] args) {
		
Message m = new Message();
Thread1 t1= new Thread1(m);
Thread2 t2= new Thread2(m);
t1.start();
t2.start();
	}

}
