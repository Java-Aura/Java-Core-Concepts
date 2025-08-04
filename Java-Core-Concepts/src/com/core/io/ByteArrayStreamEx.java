package com.core.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		
		
		String str = "java";
		byte arr[] = {1,3,5,6};
		
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
			ByteArrayInputStream bis1 = new ByteArrayInputStream(arr);
			byte[] readAllBytes = bis.readAllBytes();
			byte[] readAllBytes1 = bis1.readAllBytes();
			for(int b : readAllBytes) {
				System.out.print((char)b);
			}
			System.out.println();
			for(int b : readAllBytes1) {
				System.out.print(b);
			}
			System.out.println();
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			bos.write(str.getBytes());
			System.out.println(bos.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
