package com.kh.day02.exercise;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// ���� A�� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		char word = 'A';
		
		System.out.println("���� �빮�� Ȯ�� : " + Character.isUpperCase(word));
		
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
		result = ('A' <= word) && (word <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + result);
	}
}
