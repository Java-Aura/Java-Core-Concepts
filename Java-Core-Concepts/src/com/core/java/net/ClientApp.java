package com.core.java.net;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("192.168.1.7", 2314);
		System.out.println("Waiting for server to accept request");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String str1 ="", str2="";
		while(!str1.equalsIgnoreCase("exit")) {
			System.out.println("Enter message to send to server");
			str1 = sc.nextLine();
			dos.writeUTF(str1);
			dos.flush();
			str2= dis.readUTF();
			System.out.println("Message from server: "+ str2);
		}
		s.close();
		sc.close();
		

	}

}
