package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// 버퍼 크기를 5로 하고, 표준 출력 스트림(System.out, 콘솔에 출력하는 스트림이구나~)과 연결한
		// 버퍼 출력 스트림을 생성하라!
		// C:\Temp\text2.txt파일에 저장된 영문 텍스트를 읽어
		// 버퍼 출력 스트림을 통해 출력하라!!
		
		
		// 파일 입력용
		FileReader fr = null;
		BufferedOutputStream bOut = null; // 콘솔출력용
		int readChar;
		try {
			fr = new FileReader("C:\\Temp\\kh.txt");
			// 콘솔 출력용, sop를 쓰지 않고 버퍼드어쩌구를 이용해 콘솔 출력을 할 수 있게 됨~!~!~!~!~
			// 원래 롸이트는 파일을 만들엇엇는데~~ 콘솔에 출력
			bOut = new BufferedOutputStream(System.out, 5); //버퍼크기5~출력스트림생성
			while((readChar = fr.read()) != -1) {
				bOut.write(readChar);
			}
			new Scanner(System.in).nextLine();
			
			//엔터를 치면 플러쉬가 동작을해서 z입력, 버퍼크기를 6으로 바꾸면 yz출력
			bOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
