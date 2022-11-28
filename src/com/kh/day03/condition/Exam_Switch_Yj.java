package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch_Yj {

	public static void main(String[] args) {

		/*
		 * switch case������ ���� ������
		 * �� ���� ������ �Է¹ް� 
		 * �����ڸ� �Է� �޾� ����ϴ� ���� ���α׷� �ۼ�!
		 * 
		 * ������ �Է��� �ּ���
		 * ������ �� �� �� �Է��� �ּ���
		 * �����ڸ� �Է��� �ּ���(+, -, *, /, %)
		 * ���
		 */
		

		Scanner sc = new Scanner(System.in);

		for(;;) {
			
			System.out.print("������ �Է��� �ּ���. > ");
			int num1 = sc.nextInt();
			
			System.out.print("������ �� �� �� �Է��� �ּ���. > ");
			int num2 = sc.nextInt();
			
			System.out.print("�����ڸ� �Է��� �ּ���.(+, -, *, /, %) > ");
			char operator = sc.next().charAt(0);
			
			int result = 0;
			
			
			switch (operator) {
			
			case '+':
				result = num1 + num2;
				break;
				
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
			case '/':
				result = num1 / num2;
				break;
				
			case '%':
				result = num1 % num2;
				break;
				
			default:
				break;
			}
			
			System.out.printf("��� : %d %c %d = %d\n", num1, operator, num2, result);
			
		}

	}

}
