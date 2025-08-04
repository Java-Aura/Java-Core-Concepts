package com.core.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\BufferedWriterExample.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));){
			char ch [] = {'c','t'};
			String str = "java";
			bw.write("test data");
			bw.newLine();
			bw.write(65);
			bw.newLine();
			bw.write(ch);
			bw.newLine();
			bw.write(str);
			bw.newLine();
			bw.write(65);
			bw.flush();
			System.out.println("Data hs been written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
