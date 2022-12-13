package com.kh.day13.iostream;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) {
		File file =  new File("C:\\Temp\\camembert.png");
		String filename = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		
		System.out.println("���� �̸� : " + filename);
		System.out.println("���� ��� : " + path);
		System.out.println("�θ� ���� : " + parent);
		
		File fileMake = new File("src/iostream/fileOne.txt");
		//���� ����⵵ ����
		try {
			fileMake.createNewFile();
			
			//���� ����⵵ ����
			File folderMake = new File("src/file");
			folderMake.mkdir(); 
			
			//���� �������ٰ� �� ���� �������ʹ�
			File fileMake2 = new File("src/file/file.txt");
			fileMake2.createNewFile();
			
			
			System.out.println("������ �����ϴ°�? : " + fileMake.exists());
			System.out.println("fileOne.txt�� ������ �´°�? : " + fileMake.isFile());
			System.out.println("file������ ������ �´°�? : " + folderMake.isDirectory());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
