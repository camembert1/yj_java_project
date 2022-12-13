package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//�ּ�ó���Ѱ� �迭���� data~����Ѱ�~~!!
public class ChattingServer {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			System.out.println("ä�ü����� �������Դϴ�...");
			Thread.sleep(2000); // 2�� �����ϱ� ���� ���
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�!");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("ä���� ���۵Ǿ����ϴ�.");
			
			while(true) {
				
				System.out.print("����(��) : ");
				String sendMsg = sc.nextLine();
//				byte[] bytes = sendMsg.getBytes();	
//				os.write(bytes);
				dos.writeUTF(sendMsg);
				
//				byte[] buf = new byte[100];
//				int readNo = is.read(buf);
//				String recMsg = new String(buf, 0, readNo);
				String recvMsg = dis.readUTF();
				System.out.printf("Ŭ���̾�Ʈ(���) : %s%n", recvMsg);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
