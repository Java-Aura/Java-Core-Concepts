package com.core.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Test.java");
		File f1 = new File("D:\\TestDIR");
		System.out.println(f.exists());
		System.out.println(f1.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		if(!f1.exists()) {
			f1.mkdir();
		}
		System.out.println(f1.exists());
		System.out.println(f.exists());
		

	}

}
