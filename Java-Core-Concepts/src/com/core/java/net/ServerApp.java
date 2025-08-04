package com.core.java.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(2314);
		System.out.println("Waiting for client");
		Socket s = ss.accept(); // accepts the client connection.
		System.out.println("Connection accepted");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String str1 ="", str2="";
		while(!str1.equalsIgnoreCase("exit")) {
			
			str2= dis.readUTF();
			System.out.println("Message from client: "+ str2);
			
			System.out.println("Enter message to send to client");
			str1 = sc.nextLine();
			dos.writeUTF(str1);
			dos.flush();
			
		}
		s.close();
		ss.close();
		sc.close();
		

	}

}
