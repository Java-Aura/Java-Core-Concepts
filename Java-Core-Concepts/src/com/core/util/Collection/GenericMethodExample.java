package com.core.util.Collection;

import com.core.abstracttion.AccountInfo;

public class GenericMethodExample {

	public static void main(String[] args) {
		
		GenericMethod gm = new GenericMethod();
		gm.<String>genericMethod("sv");
		gm.<Integer>genericMethod(123);
		AccountInfo acc = new AccountInfo();
		acc.setName("TestAcc");
		gm.genericMethod(acc);
		GenericMethod1 gm1 = new GenericMethod1();
		gm1.genericMethod(123);
	}

}


class GenericMethod{
	
	public <T> void genericMethod(T data) {
		System.out.println(data);
	}
}

class GenericMethod1{
	
	public <T extends Number> void genericMethod(T data) {
		System.out.println(data);
	}
}
