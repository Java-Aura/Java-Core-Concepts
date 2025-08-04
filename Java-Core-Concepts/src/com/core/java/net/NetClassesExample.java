package com.core.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class NetClassesExample {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.w3schools.com/java/java_variables.asp");
		URLConnection uc= url.openConnection();
		System.out.println(InetAddress.getLocalHost());
		
		InputStream openStream = uc.getInputStream();
		byte[] readAllBytes = openStream.readAllBytes();
		String str = new String(readAllBytes);
		System.out.println(str);
	}
}
