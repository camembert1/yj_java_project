package com.kh.day13.socket.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {

		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;

		try {

			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885);// 127.0.0.1 �ڱ��ڽ�
			System.out.println("���Ἲ��!");

			////////// ������ ������ /////////
			byte[] buf = null;
			String message = "";

			os = socket.getOutputStream(); // ���Ͽ��� ������ ��Ʈ��~
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			//////////////////////////////////

			////////// ������ �ޱ� //////////
			byte[] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			message = new String(bytes, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			//////////////////////////////////

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
