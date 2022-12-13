package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterChar {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/fileWriter.txt");
			char[] cbuf = "sadfsad자바가 젤 쉬웠어요f".toCharArray();
			writer.write(cbuf); //cbuf,0,2~
			writer.flush();
			System.out.println("동작완료");
			
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

}
