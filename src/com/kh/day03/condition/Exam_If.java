package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���. > ");
		int num = sc.nextInt();
		
		
		String result = "";
		if (num % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		System.out.printf("%d��(��) %s�Դϴ�.", num, result);

	}

}
