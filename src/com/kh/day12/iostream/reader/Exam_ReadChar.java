package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		
		
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/fileReader.txt");
			int readCharNo;
			String dataString = "";
			char[] cbuf = new char[2]; //�� �� ���� �� �� ���ھ� ���� ���� '�ڹٿ���Ŭ' �߿� '�ڹ�' ���
			
			while(true) {
				readCharNo = reader.read(cbuf);
				if(readCharNo == -1) break;
				dataString += new String(cbuf, 0, readCharNo);
			}
			System.out.println(dataString);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
