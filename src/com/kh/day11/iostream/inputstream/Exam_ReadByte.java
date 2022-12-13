package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo;
			byte[] readBytes = new byte[3];
			
			String data = "";
//			while(true) {
//				readByteNo = is.read(readBytes); //읽은 개수를 알려준다~~
//				if (readByteNo == -1) break;
//				data += new String(readBytes, 0, readByteNo); //개수 말고 내용 내놔~~!
//			}
			
			//더 간단하게!
			while((readByteNo = is.read(readBytes)) != -1) {
				data += new String(readBytes, 0, readByteNo); //개수 말고 내용 내놔~~!
			}
			
			
			System.out.println(data);
//			System.out.println(readBytes[0]);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
