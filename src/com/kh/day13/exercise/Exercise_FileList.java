package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {

	public static void listDirectory(File dir) {
		System.out.println("------ " + dir.getPath() + "�� ���� ����Ʈ�Դϴ�. ------");
		File[] subFiles = dir.listFiles(); //�� �迭�δ�~~!~! �� �޼ҵ� �������� ������ ��ü�迭��
		for (int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%-37s",fOne.getName());
			System.out.printf("\t���� ũ�� : %-10d",fOne.length());
			System.out.printf("\t������ �ð� : %3tb %td�� %ta %tT%n", time, time,time, time);
			//�� �� ���� �ð� �������°�
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:\\windows");
		System.out.printf("%s%n%s%n%s%n",f1.getPath(),f1.getParent(),f1.getName());
		
		listDirectory(f1);
	}
	
}
