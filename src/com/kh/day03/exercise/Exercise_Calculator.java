package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {

		// �� ���� ������ �Է¹ް� �����ڸ� �Է� �޾� ����ϴ� ���� ���α׷� �ۼ�!
		
		// ������ �Է��� �ּ���
		// ������ �� �� �� �Է��� �ּ���
		// �����ڸ� �Է��� �ּ���(+, -, *, /, %)
		// ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��� �ּ���. > ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է��� �ּ���. > ");
		int num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է��� �ּ���.(+, -, *, /, %) > ");
		char operator = sc.next().charAt(0);
		
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			result = num1 % num2;
		}
		
		System.out.printf("��� : %d %c %d = %d",num1, operator, num2, result);
	}

}
