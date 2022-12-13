package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	
	public static void fileCopy() {
		// �̹��� ���� ���� - ����Ʈ ��� ����� ��Ʈ�� ����ؾ� ��! �̹����ϱ�!
		// C:\\img\\camembert.jpeg -> C:\\camem.jpeg
		// ����Ʈ ��� �Է� ��Ʈ��
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\camembert.png");
			os = new FileOutputStream("C:\\img\\camem.png"); //���� �ذ� : ��� ����
			byte[] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {
				// ��������� ���� �б� ����, ���� ����ߴ�~
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		
		
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.next();
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			
			System.out.printf("'%s' ���Ͽ� ����� ���� �Է� : %n", fileName);
			System.out.println("����� exit");
			sc.nextLine();
			
			String fileContent = "";
			String fileContents = "";
			for (int i = 1; ; i++) {
				System.out.print(i + " : ");
				fileContent = sc.nextLine();
				if ("exit".equals(fileContent)) break;
				fileContents += (fileContent + "\n");
			}
			
			char[] cbuf = fileContents.toCharArray();
			writer.write(cbuf);
			writer.flush();
			System.out.println("���ۿϷ�!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		fileCopy();
//		memoFileMake();
	}
}

