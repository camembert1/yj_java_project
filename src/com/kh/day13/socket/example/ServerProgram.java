package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) { // 실행순서는 서버부터!

		ServerSocket serverSocket = null; // 따로 빼는 이유는 나중에 자원해제할때 사용하려고
		InputStream is = null;
		OutputStream os = null;

		try {
			System.out.println("연결 기다림...");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept(); // nextInt처럼 연결 될때까지 기다림
			System.out.println("연결 수락됨!!");

			////////// 데이터 받기 //////////
			byte[] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			//////////////////////////////////

			////////// 데이터 보내기 /////////
			byte[] buf = null;
			message = "";

			os = socket.getOutputStream(); 
			message = "Hello Client";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//////////////////////////////////

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
