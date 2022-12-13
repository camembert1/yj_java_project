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
			System.out.println("���� �������Դϴ�.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�..");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			// �̵��� ����~~ �ݺ���, ó�� �� �Է� ���� �� �߸����� ��� ����ó��
			//�Է¹��� �迭�� ���̰� 3�� �ƴҶ� ���� �޼��� ������
			while (true) {
				String readStr = dis.readUTF();
				
				if (readStr.equalsIgnoreCase("bye")) {
					System.out.println("����Ǿ����ϴ�");
					break;
				} else {
					// �Է¹��� ���� �ޱ�
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
//				System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
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
