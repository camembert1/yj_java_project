package com.kh.day12.iostream.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/iostream/fileWriter.txt");
			String data = "�ڹ���S";
			writer.write(data);
			writer.flush(); // close�� �ֱ� ������ flush�� ��� ��
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
