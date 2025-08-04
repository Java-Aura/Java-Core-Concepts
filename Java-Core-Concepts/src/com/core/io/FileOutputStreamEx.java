package com.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		
		try (InputStream is = new FileInputStream("D:\\Images\\img1.png");
			FileOutputStream fos = new FileOutputStream("D:\\Images-1\\img-2.png");){
			
			fos.write(is.readAllBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
