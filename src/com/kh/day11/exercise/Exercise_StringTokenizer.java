package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {

	public static void main(String[] args) {
		exercise1();

	}
	
	static void exercise1() {
		// ȫ�浿/��ȭ/ȫ��/����/���� �� ���ڿ� �����͸�~/�������� �߶� ȫ�ø� ����Ͻÿ�
		
		String words = "ȫ�浿/��ȭ/ȫ��/����/����";
		
		// ��ü ���
		StringTokenizer st = new StringTokenizer(words, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		// ȫ�ø� ���
		String[] word = words.split("/");
		for (int i = 0; i < word.length; i++) {
			if(word[i].equals("ȫ��")) {
				System.out.println(word[i]);
			}
		}
//		System.out.println(word[2]);
	}
	
	

}
