package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//�ٸ� ����� ä���ϱ�
public class ChattingClient2 {
	public static void main(String[] args) {
		
	Socket socket = null;
	String address = "192.168.160.7";
	int port = 8507;
	InputStream is = null;
	OutputStream os = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("������ �������Դϴ�...");
		Thread.sleep(2000); // 2�� �����ϱ� ���� ���
		socket = new Socket(address, port);
		System.out.println("ä�ü����� �����Ͽ����ϴ�.");
		Thread.sleep(2000); // 2�� �����ϱ� ���� ���
		is = socket.getInputStream();
		os = socket.getOutputStream();
		System.out.println("�������� ä���� �����մϴ�.");
		
		while(true) {
			
			byte[] buf = new byte[100];
			int readNo = is.read(buf);
			String recMsg = new String(buf, 0, readNo);
			System.out.printf("����(���) : %s%n", recMsg);
			
			System.out.print("Ŭ���̾�Ʈ(��) : ");
			String sendMsg = sc.nextLine();
			byte[] bytes = sendMsg.getBytes();	
			os.write(bytes);
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

//		dis = new DataInputStream(is);
//		String recMsg = dis.readUTF();
//		System.out.print("����(���) : " + recMsg);