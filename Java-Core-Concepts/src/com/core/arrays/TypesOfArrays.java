package com.core.arrays;

public class TypesOfArrays {

	public static void main(String[] args) {
	
		
		String []str = {"str","sv","sp"};
		
		for(String s : str) {
			System.out.println(s);
		}
		
		
		int arr[][]  = {{12,34,56},{78,90,65,45,3433}};
		
		for(int i =0;i<arr.length;i++) {
			for(int k =0;k<arr[i].length;k++) {
				System.out.println(arr[i][k]);
				
			}
				
			
		}
		
		
		

	}

}
