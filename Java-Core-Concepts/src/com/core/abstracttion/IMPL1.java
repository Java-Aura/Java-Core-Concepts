package com.core.abstracttion;

public class IMPL1 implements I1{
	public static void main(String[] args) {
		
		I1 obj = new IMPL1();
		obj.display();
	}

	@Override
	public void deposit() {
		
		
	}

	@Override
	public void display() {
	System.out.println(str +" "+ strI4);
		
	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
