package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		
		// ���� �ϳ��� �Է� �޾Ƽ� ���, 0, �������� �Ǻ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��� �ּ���. > ");
		int input = sc.nextInt();
		
		String result = "0";
		
		if (input > 0) {
			result = "���� ����";
		} else if (input < 0) {
			result = "���� ����";
		}
		
		System.out.printf("%s�Դϴ�.\n", result);
	}

}
