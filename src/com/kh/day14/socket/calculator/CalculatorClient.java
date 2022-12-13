package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		String address = "127.0.0.1";
		int port = 8989;
		try {
			socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			// 계산식(빈칸으로 띄어서 입력 예) 24 + 42) >> 12 + 1
			// 계산 결과 : 13
			System.out.println("계산식 입력");
			System.out.println("예) 24 + 42");
			
			while (true) {
				String endStr = dis.readUTF();
				System.out.print(">> ");
				
				// 입력 받은 값 보내기
				String input = sc.nextLine();
				if (input.equalsIgnoreCase("bye")) break;
				dos.writeUTF(input);
				
				// 입력 받은 값 받기
				String resultStr = dis.readUTF();
				System.out.printf("계산 결과 : %s%n%n", resultStr);
				
				
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
