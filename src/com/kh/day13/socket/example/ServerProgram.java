package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) { // ��������� ��������!

		ServerSocket serverSocket = null; // ���� ���� ������ ���߿� �ڿ������Ҷ� ����Ϸ���
		InputStream is = null;
		OutputStream os = null;

		try {
			System.out.println("���� ��ٸ�...");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept(); // nextIntó�� ���� �ɶ����� ��ٸ�
			System.out.println("���� ������!!");

			////////// ������ �ޱ� //////////
			byte[] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			//////////////////////////////////

			////////// ������ ������ /////////
			byte[] buf = null;
			message = "";

			os = socket.getOutputStream(); 
			message = "Hello Client";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			//////////////////////////////////

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
