package com.core.io;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamExample {

	public static void main(String[] args) {
		
		try (DataInputStream dis = new DataInputStream(System.in);
				FileOutputStream fos = new FileOutputStream("D:\\DATA-IO.txt");
				FileInputStream fis = new FileInputStream("D:\\DATA-IO.txt");){
			System.out.println("Enter text to write into the file put @ at the end to stop");
			char ch;
			while((ch = (char)dis.read())!= '@') {
				fos.write(ch);
			}
			DataOutputStream dos = new DataOutputStream(System.out);
			
			int c;
			while((c = fis.read())!=-1) {
				dos.writeChar(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
