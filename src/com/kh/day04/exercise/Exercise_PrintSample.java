package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		
		/*
		 * System.out.println();����
		 * ���� + ���ڿ� -> ���ڿ�
		 * System.out.println(1 + "1");
		 * 
		 */

		System.out.println(1 + "1");
		
		// ���� + ���� -> ����
		System.out.println('1' + '1');
		// 1�� �ƽ�Ű�ڵ�� 49, ����� 98�� ���ڴ� ����~!~!
		
		// ���� + ���� +���ڿ� + ����
		System.out.println(3 + 3 +"abc"+ 5);
		// ���������� ���ڿ��� �Ǵµ� ���� ���� �� ���� ���ڷ� ����
		
		// printf�� ���Ͽ� �˾ƺ���
		// println, print -> �ٹٲ��� ����
		// printf
		System.out.printf("���� ���", 1);
		System.out.printf("\n���� ��� : %d", 1);
		System.out.printf("\n���ڿ� ��� : %s", "Hello World!");
		
	}

}
