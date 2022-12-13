package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte[] data = "Hello I/O".getBytes(); 
			
			for (int i = 0; i < data.length; i++) {
				
				os.write(data[i]);
			}
			os.flush(); //읽을 때는 ㄴㄴ 쓸 때 / 버퍼라는 공간을 비워줘야 함
			
			System.out.println("쓰기완료!");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
