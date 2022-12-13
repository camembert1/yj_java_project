package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("Ŭ���̾�Ʈ ������ �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Thread.sleep(500);			
			System.out.println("���� �غ� �Ϸ�");
			Thread.sleep(500);
			System.out.println();
			
			END:
			while(true) {
				System.out.print("-> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				System.out.println(dis.readUTF());
				String result = dis.readUTF();
				if(result.equals("����")) {
					System.out.println("   �����Դϴ�~");
					break END;
				}
				
			}
			
			// ��׵� �� Exception �ϳ��� ���� �� ����! catch (Exception e) �̷���
			// �ٸ� �̷��� �ϸ� ����ȭ�ؼ� �� �� �� �ڵ� �������ּ���~~ �̷� �� �Ұ���~!~!
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
