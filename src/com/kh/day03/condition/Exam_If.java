package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���. > ");
		int num = sc.nextInt();
		
//		if (num % 2 == 0) {
//			System.out.println(num + "��(��) ¦���Դϴ�.");
//		} else {
//			System.out.println(num + "��(��) Ȧ���Դϴ�.");
//		}
		
		String result = "";
		if (num % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		

		
		
	}

}
