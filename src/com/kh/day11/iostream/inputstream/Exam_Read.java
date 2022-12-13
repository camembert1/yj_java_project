package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		
		InputStream is = null; //�߻�Ŭ����~!~!~��ü ������ �ȵȴ�~!~! ���� null�� �ʱ�ȭ
		
		//FileNotFoundException -> Checked Exception �ݵ�� try-catch ����� �ϴ� Exception

		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByte;
			
			//while���� ���� ���� ���̸�ŭ �е���!
			while(true) {
				readByte = is.read();
				if(readByte == -1) break; //readByte�� ������  -1���� ������!!
				System.out.print((char)readByte);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
