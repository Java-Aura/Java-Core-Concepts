package com.core.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.display();
		//System.out.println(obj.j);
		//System.out.println(obj.k);
	}

}

class Encapsulation{
	
	/*data or variables*/
	 private int k = 90;
	 private int j = 78;
	
	public void display() {
		System.out.println("The value of k: "+ k);
		System.out.println("The value of j: "+ j);
	}
	
}
