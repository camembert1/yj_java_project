package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {

		/*
		 * ���׿����� - ���� if���� ���� �ʾƵ� �Ǵ� ������ ��Ȳ�� ���
		 * �׸��� 3��
		 * (���ǽ�) ? ���� �� : ������ ��;
		 *  - ���ǽ��� �ݵ�� true or false�� ��ȯ
		 *  - ��/�������� �ַ� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���. > ");
		int input = sc.nextInt();
		
		String result = (input%2==0) ? input + "��(��) ¦���Դϴ�." : input + "��(��) Ȧ���Դϴ�.";
		
		System.out.println(result);
	}

}
