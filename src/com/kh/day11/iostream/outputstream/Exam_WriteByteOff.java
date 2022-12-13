package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte[] data = "JAVAscriptapple".getBytes();
			os.write(data); //�ڿ��� ������!!!
			os.flush();
			System.out.println("��¿Ϸ�!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}