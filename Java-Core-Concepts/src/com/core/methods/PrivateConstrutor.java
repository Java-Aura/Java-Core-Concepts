package com.core.methods;

public class PrivateConstrutor {

	public static void main(String[] args) {
		
		//ConstructorPrivate obj = new ConstructorPrivate();// gives error due to private constructor.
		ConstructorPrivate instance = ConstructorPrivate.getInstance();
		instance.k=78;
		System.out.println(instance.k);
		ConstructorPrivate instance1 = ConstructorPrivate.getInstance();
		ConstructorPrivate instance2 = ConstructorPrivate.getInstance();
		System.out.println(instance1.k);
		System.out.println(instance2.k);
	}

}

class ConstructorPrivate{
	int k =90;
	static int j;
	static ConstructorPrivate instance = null;
	
	private ConstructorPrivate(){
		j=89;
		k =90;
	}
	
	
	public static ConstructorPrivate getInstance() {
		if(instance == null) {
			instance =  new ConstructorPrivate();
		}
		
		return instance;
	}
	
}
