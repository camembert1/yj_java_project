package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical3 {

	public static void main(String[] args) {
		
		//�Է� ���� ������ 1 ~ 100 ������ �������� Ȯ���ϼ���!
		// ��, �Է� ���� ���ڴ� ���� num�� �ʱ�ȭ���ּ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ��� > ");
		int num = sc.nextInt();
		
		boolean result = (1 < num) && (num < 100);
		System.out.println("1���� 100������ �����ΰ� ? " + result);
		
	}
}
