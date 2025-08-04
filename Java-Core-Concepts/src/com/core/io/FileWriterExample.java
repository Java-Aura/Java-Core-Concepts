package com.core.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\WriterTest1.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		try (FileWriter fw = new FileWriter(f);){
			char ch [] = {'c','t'};
			String str = "java";
			fw.write("test data");
			fw.write("\n");
			fw.write(65);
			fw.write("\n");
			fw.write(ch);
			fw.write("\n");
			fw.write(str);
			fw.write("\n");
			fw.write(65);
			//fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
