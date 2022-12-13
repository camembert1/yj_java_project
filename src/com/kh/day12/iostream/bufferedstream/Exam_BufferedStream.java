package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// ���� ũ�⸦ 5�� �ϰ�, ǥ�� ��� ��Ʈ��(System.out, �ֿܼ� ����ϴ� ��Ʈ���̱���~)�� ������
		// ���� ��� ��Ʈ���� �����϶�!
		// C:\Temp\text2.txt���Ͽ� ����� ���� �ؽ�Ʈ�� �о�
		// ���� ��� ��Ʈ���� ���� ����϶�!!
		
		
		// ���� �Է¿�
		FileReader fr = null;
		BufferedOutputStream bOut = null; // �ܼ���¿�
		int readChar;
		try {
			fr = new FileReader("C:\\Temp\\kh.txt");
			// �ܼ� ��¿�, sop�� ���� �ʰ� ���۵��¼���� �̿��� �ܼ� ����� �� �� �ְ� ��~!~!~!~!~
			// ���� ����Ʈ�� ������ ��������µ�~~ �ֿܼ� ���
			bOut = new BufferedOutputStream(System.out, 5); //����ũ��5~��½�Ʈ������
			while((readChar = fr.read()) != -1) {
				bOut.write(readChar);
			}
			new Scanner(System.in).nextLine();
			
			//���͸� ġ�� �÷����� �������ؼ� z�Է�, ����ũ�⸦ 6���� �ٲٸ� yz���
			bOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
