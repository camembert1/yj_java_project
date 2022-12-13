package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		
		// ����Ʈ ��� ��Ʈ��
		InputStream is = null;
		
		
		// ���� ��� ��Ʈ��
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/fileReader.txt");
			
			while (true) {
				int readData = reader.read();
				if (readData == -1) break;
				System.out.print((char)readData);
			}
			// inputstream�̶� �Ӱ��ٸ���?? inputstream�� �ѱ��� �� �д´�~!!~!
			// �ѱ��� 2byte�� stream���� ���� �Ǹ� 2byte�����Ͱ� ������ �ϳ��� �ѱ��� �Ǵµ�
			// inputstream�� 1byte�� ���� �׷��� ������~!~!~!~!
			// �迭�� �̿��ؼ� �迭 ũ�⸦ 2�� �ؼ� ������ �ѱ۵� ���� ���� �հ���~!?
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // ������ ���� ��� ������ ��Ʈ���� �ݾ��� �� �ְ�! �ݵ�� ����ž� �ϴ� �ڵ带 �ۼ���
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
