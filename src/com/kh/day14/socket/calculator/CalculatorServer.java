package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class CalculatorServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 8989;
		
		try {
			System.out.println("서버 구동중입니다.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			// 이따가 수정~~ 반복문, 처음 식 입력 받을 때 잘못했을 경우 예외처리
			//입력받은 배열의 길이가 3이 아닐때 오류 메세지 보내기
			while (true) {
				String readStr = dis.readUTF();
				
				if (readStr.equalsIgnoreCase("bye")) {
					System.out.println("종료되었습니다");
					break;
				} else {
					// 입력받은 계산식 받기
					String[] readStrArrs = readStr.split(" ");
					int result = 0;
					int num1 = Integer.parseInt(readStrArrs[0]);
					int num2 = Integer.parseInt(readStrArrs[2]);
					
					switch (readStrArrs[1]) {
					case "+": 
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
					case "/":
						result = num1 / num2;
						break;
					case "%":
						result = num1 % num2;
						break;
						
					default:
//				System.out.println("연산자를 잘못 입력하셨습니다.");
						break;
					}
					
					dos.writeUTF(result + "");
					
					
				}
				
				
				
			}
			
			
			
					
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
