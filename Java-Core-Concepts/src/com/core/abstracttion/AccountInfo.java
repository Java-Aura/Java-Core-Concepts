package com.core.abstracttion;

public class AccountInfo {

	String name;
	String address;
	String accNumber;
	String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AccountInfo [name=" + name + ", address=" + address + ", accNumber=" + accNumber + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
