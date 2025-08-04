package com.core.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		
		
		try(Scanner sc = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream("");) {
			System.out.println("Enter value 1");
			int a = sc.nextInt();
			System.out.println("Enter value 2");
			int b = sc.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e){
			e.printStackTrace();
		}
/*finally {
	System.out.println("closing resource");
	sc.close();
}*/
	}

}
