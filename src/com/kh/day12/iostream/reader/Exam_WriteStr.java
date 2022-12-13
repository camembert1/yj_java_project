package com.kh.day12.iostream.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/fileWriter.txt");
			String data = "자바잦밪";
			writer.write(data);
			writer.flush(); // close가 있기 때문에 flush가 없어도 됨
			System.out.println("출력완료");
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
