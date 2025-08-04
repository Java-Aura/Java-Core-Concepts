package com.core.abstracttion;

public interface RBI {

	public void depositAMT(int amount);
	public void withdrawAMT(int amount);
	public void accountInfo(AccountInfo accInfo);
	default void UpdateKYC(AccountInfo accInfo) {
		System.out.println("Default concrete method from interface");
	}
	static public String policy() {
		return "customer privacy maintained"; 
	}
}
