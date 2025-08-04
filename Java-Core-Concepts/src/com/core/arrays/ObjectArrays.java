package com.core.arrays;

public class ObjectArrays {

	public static void main(String[] args) {

		UserDetails []obj = new UserDetails[2];
		UserDetails ob = new UserDetails();
		ob.setName("sv");
		ob.setAddress("Hyd");
		UserDetails ob1 = new UserDetails();
		ob1.setName("sp");
		ob1.setAddress("KMNR");
		
		obj[0]=ob;
		obj[1]=ob1;
		
		for(UserDetails userDetails: obj) {
			System.out.println(userDetails.toString());
		}

	}

}

class UserDetails{
	
	public String name;
	public String address;
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
	@Override
	public String toString() {
		
		return "Name: " +this.name + " Address: "+this.address;
	}
	
}
