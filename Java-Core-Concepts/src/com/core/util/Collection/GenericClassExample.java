package com.core.util.Collection;

import com.core.abstracttion.AccountInfo;

public class GenericClassExample {

	public static void main(String[] args) {

		Generic<Integer> genericInteger = new Generic<Integer>(14);
		Generic<String> genericString = new Generic<String>("Java");
		System.out.println(genericInteger.getData());
		System.out.println(genericString.getData());
		AccountInfo acc = new AccountInfo();
		acc.setName("TestAcc");
		Generic<AccountInfo> genericAccount= new Generic<AccountInfo>(acc);
		System.out.println(genericAccount.getData());
		GenericSpecific<Integer>  gs= new GenericSpecific<Integer>(12);
		GenericSpecific<Long>  gs1= new GenericSpecific<Long>(Long.valueOf(13));
		GenericSpecific<Float>  gs2= new GenericSpecific<Float>(Float.valueOf(14));
	}

}


class Generic<T>{
	
	private T data;

	public Generic(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
	
}

class GenericSpecific<T extends Number>{
	
	private T data;

	public GenericSpecific(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
}


