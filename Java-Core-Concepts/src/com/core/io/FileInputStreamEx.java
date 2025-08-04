package com.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\test1.java");
		try (InputStream is = new FileInputStream(f);){
			
			
			byte arr[] = new byte[800];
			is.read(arr);
			System.out.println(new String(arr));

			byte[] readAllBytes = is.readAllBytes();
			String str = new String(readAllBytes);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
