package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			
			int readByteNo;
			byte[] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 2, 5);
			// 바가지를 다 퍼서 올리는거 ㄴㄴㄴ 바가지에서 어디부터 어디까지 쓸 건지 결정
			// 커스터마이징
			
			for (int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
