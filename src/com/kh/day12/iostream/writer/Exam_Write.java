package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		
		// ���ڱ�� ��½�Ʈ��
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/fileWriter.txt");
			char[] cbuf = "������&Ŭ���� �� ������ �缺����".toCharArray();//���ڹ迭�� �����
			for (int j = 0; j < cbuf.length; j++) {
				writer.write(cbuf[j]);
			}
			writer.flush(); //�̰� �������
			System.out.println("��¿Ϸ�");
			
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
