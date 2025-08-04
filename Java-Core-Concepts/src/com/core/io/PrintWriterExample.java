package com.core.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {


		public static void main(String[] args) throws IOException {
			File f = new File("D:\\PrintWriterExample.txt");
			if(!f.exists()) {
				f.createNewFile();
			}
			try (PrintWriter pw = new PrintWriter(new FileWriter(f));){
				char ch [] = {'c','t'};
				String str = "java";
				pw.println("test data");
				pw.println(65);
				pw.println(str);
				pw.println(65);
				pw.println(ch);
				pw.flush();
				System.out.println("Data hs been written");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}
