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
		// 이미지 파일 복사 - 바이트 기반 입출력 스트림 사용해야 함! 이미지니까!
		// C:\\img\\camembert.jpeg -> C:\\camem.jpeg
		// 바이트 기반 입력 스트림
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\camembert.png");
			os = new FileOutputStream("C:\\img\\camem.png"); //오류 해결 : 경로 문제
			byte[] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {
				// 여기까지가 파일 읽기 성공, 이제 써줘야댐~
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("복사가 완료되었습니다.");
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
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt'' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		
		
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		
		try {
			writer = new FileWriter("src/iostream/" + fileName);
			
			System.out.printf("'%s' 파일에 저장될 내용 입력 : %n", fileName);
			System.out.println("종료는 exit");
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
			System.out.println("동작완료!");
			
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

