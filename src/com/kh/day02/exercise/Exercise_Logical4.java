package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical4 {

	public static void main(String[] args) {
		// �Է� ���� ���ڰ� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� > ");
		
		char word = sc.next().charAt(0);
		
		
		boolean result = ('A' <= word) && (word <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " + result);
		
		//������ ���� ó������ ���� �� �ֵ��� ����
	}
}

