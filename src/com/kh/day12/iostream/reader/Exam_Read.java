package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		
		// 바이트 기반 스트림
		InputStream is = null;
		
		
		// 문자 기반 스트림
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/fileReader.txt");
			
			while (true) {
				int readData = reader.read();
				if (readData == -1) break;
				System.out.print((char)readData);
			}
			// inputstream이랑 머가다른데?? inputstream은 한글을 못 읽는다~!!~!
			// 한글은 2byte라서 stream으로 들어가게 되면 2byte데이터가 만나서 하나의 한글이 되는데
			// inputstream은 1byte씩 읽음 그래서 깨진다~!~!~!~!
			// 배열을 이용해서 배열 크기를 2로 해서 읽으면 한글도 읽을 수가 잇겟죠~!?
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 오류가 나든 어떻든 무조건 스트림을 닫아줄 수 있게! 반드시 실행돼야 하는 코드를 작성함
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
