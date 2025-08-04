package com.core.statements;

import java.util.Scanner;

public class ConditionalStatements {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Validate validate =  new Validate();
		System.out.println("Enter User Age : ");
		int age = new Scanner(System.in).nextInt();
		String result = validate.validateAge(age);
		System.out.println(""+result);
		System.out.println("Enter site name :");
		String siteName = new Scanner(System.in).nextLine();
		String url = validate.getUrl(siteName);
		System.out.println(url);
		validate.getUrl2(siteName);

	}

}


class Validate{
	
	public String validateAge(int age) {

		if (age >= 18) {
			return "User is major";
		} else if (age >= 15 && age < 18) {

			return "User has to wait";
		} else {
			return "User is minor";
		}

	}
	
	public String getUrl(String siteName) {
		
		switch (siteName) {
		
		case "google":
			return "www.google.com";
		case "yahoo":
			return "www.yahoo.com";
		default:
			return "site not found";
			
		}
		
		
	}
	
public void getUrl2(String siteName) {
		
		switch (siteName) {
		
		case "google":
		System.out.println("www.google.com");
		break;
		case "yahoo":
			System.out.println("www.yahoo.com");
			break;
		default:
			System.out.println("no site found");
			
		}
		
		
	}
	
}