package com.core.modifiers;

public class Main {

	public static void main(String[] args) {
		
		new Public().display();
		new Private().display();
		System.out.println(new Private().getK());
		System.out.println(new Private().j);
		System.out.println(new Protected().str);
	}

}
