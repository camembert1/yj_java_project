package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {

	public static void listDirectory(File dir) {
		System.out.println("------ " + dir.getPath() + "의 서브 리스트입니다. ------");
		File[] subFiles = dir.listFiles(); //왜 배열인대~~!~! 이 메소드 리턴형이 파일의 객체배열임
		for (int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%-37s",fOne.getName());
			System.out.printf("\t파일 크기 : %-10d",fOne.length());
			System.out.printf("\t수정한 시간 : %3tb %td일 %ta %tT%n", time, time,time, time);
			//월 일 요일 시간 가져오는거
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("C:\\windows");
		System.out.printf("%s%n%s%n%s%n",f1.getPath(),f1.getParent(),f1.getName());
		
		listDirectory(f1);
	}
	
}
