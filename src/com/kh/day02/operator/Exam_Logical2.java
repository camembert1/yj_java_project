package com.kh.day02.operator;

public class Exam_Logical2 {

	public static void main(String[] args) {
		
		System.out.println("�������� ����2");
		int aNum = 70, bNum = 55;
		boolean result1, result2, result3, result4;
		result1 = (aNum == bNum) || (aNum++ < 100); // true, aNum = 71
		result2 = (aNum < bNum) && (--bNum < 55); // false **����** �ڿ��� ���� �� ��
		result3 = (aNum != bNum) && (bNum-- < aNum++); // true, aNum = 72, bNum = 54
		result4 = (aNum++ != bNum) || (bNum++ >= 85); // true, aNum = 73 **����** �ڿ��� ���� �� ��
		
		System.out.println("result1�� ����� : " + result1);
		System.out.println("result2�� ����� : " + result2);
		System.out.println("result3�� ����� : " + result3);
		System.out.println("result4�� ����� : " + result4);
		
		System.out.println("aNum�� ����� : " + aNum + " , bNum�� ����� : " + bNum);
	}

}
