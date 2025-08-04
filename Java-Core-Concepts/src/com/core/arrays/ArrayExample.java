package com.core.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		int arr[] = new int[10]; // possible index access 0-9
		
		String []str = new String[10]; // possible index access 0-9
		
		
		arr[1] = 12;
		arr[9] = 23;
		System.out.println(arr.length);
		// arr[10] = 23; // ArrayIndexOutOfBoundsException due to the available index is
		// 9
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int k =0;
		while(k <arr.length) {
			System.out.println(arr[k]);
			k++;
		}

	}

}
