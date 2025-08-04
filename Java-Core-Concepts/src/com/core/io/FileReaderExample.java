package com.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Test.java");
		
		try(FileReader fr = new FileReader(f);FileReader fr1 = new FileReader(f); ) {
			char ch [] = new char[400];
			int read = fr.read();
			while(read != -1) {
				System.out.print((char)read);
				read = fr.read();
			}
			fr1.read(ch);
			System.out.println("printing using char array");
			System.out.println(ch);
			/*
			 * for(char c : ch) { System.out.print(c); }
			 */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
