package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		
		InputStream is = null; //추상클래스~!~!~객체 생성이 안된다~!~! 따라서 null로 초기화
		
		//FileNotFoundException -> Checked Exception 반드시 try-catch 해줘야 하는 Exception

		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByte;
			
			//while문을 통해 파일 길이만큼 읽도록!
			while(true) {
				readByte = is.read();
				if(readByte == -1) break; //readByte가 없으면  -1값을 가져옴!!
				System.out.print((char)readByte);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
