package com.core.inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		sbi.displayPolicy();
		HDFC hdfc =  new HDFC();
		hdfc.displayPolicy();
		ICICI icici = new ICICI();
		icici.displayPolicy();
		
	}

}


class RBI{
	
	public String getCommonPolicy() {
		return "Every account holder should link PAN with account";
	}
}

class SBI extends RBI{
	
	public void displayPolicy() {
		System.out.println("Policy for SBI: "+getCommonPolicy());
	}
	
	
}

class HDFC extends RBI{
	public void displayPolicy() {
		System.out.println("Policy for HDFC: "+getCommonPolicy());
	}
}

class ICICI extends RBI{
	public void displayPolicy() {
		System.out.println("Policy for ICICI: "+getCommonPolicy());
	}
	
}