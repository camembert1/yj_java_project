package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		
		// �����̸鼭 ��������� 4.3�̻��� ��� -> AND
		// ��ǻ�Ͱ��а� �Ǵ� �濵�а��� ���    -> OR
		
		System.out.println("�������� ����");
		int num1 = 50, num2 = 30;
		boolean result1, result2, result3, result4; //������ ����
		
		// num1�� num2�� �ٸ��鼭 num2�� num1���� Ŭ ��
		result1 = (num1 != num2) && (num2 > num1);
		System.out.println("result1�� ����� : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		System.out.println("result2�� ����� : " + result2);
		System.out.println("result3�� ����� : " + result3);
		System.out.println("result4�� ����� : " + result4);
		
	}

}
