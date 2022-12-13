package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//주석처리한건 배열빼고 data~사용한거~~!!
public class ChattingClient {
	public static void main(String[] args) {
		
	Socket socket = null;
	String address = "127.0.0.1";
	int port = 8507;
	InputStream is = null;
	OutputStream os = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("서버에 연결중입니다...");
		Thread.sleep(2000); // 2초 지연하기 위해 사용
		socket = new Socket(address, port);
		System.out.println("채팅서버에 접속하였습니다.");
		Thread.sleep(2000); // 2초 지연하기 위해 사용
		is = socket.getInputStream();
		os = socket.getOutputStream();
		dis = new DataInputStream(is);
		dos = new DataOutputStream(os);
		System.out.println("서버와의 채팅을 시작합니다.");
		
		while(true) {
			
//			byte[] buf = new byte[100];
//			int readNo = is.read(buf);
//			String recMsg = new String(buf, 0, readNo);
			String recvMsg = dis.readUTF();
			System.out.printf("서버(상대) : %s%n", recvMsg);
			
			System.out.print("클라이언트(나) : ");
			String sendMsg = sc.nextLine();
//			byte[] bytes = sendMsg.getBytes();	
//			os.write(bytes);
			dos.writeUTF(sendMsg);
		}
		
		
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
		
		
	}
}
