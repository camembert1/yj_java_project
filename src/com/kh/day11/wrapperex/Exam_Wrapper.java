package com.kh.day11.wrapperex;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		Integer su = Integer.valueOf(10);
		Integer sooInteger = new Integer(0); // �����, ���� �� �������� ����
		
		
		// ���ڰ� �����ִ� = static�޼ҵ�� = ��ü ���� ���� �ٷ� �ҷ��ͼ� �� �� �ִ�.
		System.out.println(Character.toLowerCase('A'));  //�ҹ��ڷ�
		System.out.println(Character.toUpperCase('a'));
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) {  // �������� üũ
			System.out.println(c1 + "�� ����");
		}
		if (Character.isAlphabetic(c2)) {  // �������� üũ
			System.out.println(c2 + "�� ������");
		}
		
		
		
		
		
		
	}
}
