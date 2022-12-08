package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		
		// 문자기반 출력스트림
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/fileWriter.txt");
			char[] cbuf = "스프링&클라우드 웹 개발자 양성과정".toCharArray();//문자배열로 만들기
			for (int j = 0; j < cbuf.length; j++) {
				writer.write(cbuf[j]);
			}
			writer.flush(); //이거 까묵지말기
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
