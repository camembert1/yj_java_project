package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Multiplication_Table2 {

	public static void main(String[] args) {
		
		/*
		 * ���������2
		 * 
		 * ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		 * ��, 9�� �ʰ��ϴ� ���ڰ� ������
		 * ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		 * 
		 * ex.
		 * ����ϰ� ���� �ܼ� �Է� : 4 
		 * ===== 4�� ===== 
		 * ===== 5�� =====
		 * ===== 6�� =====
		 * ===== 7�� =====
		 * ===== 8�� =====
		 * ===== 9�� =====
		 * (�ش� ���� ������� ���� �� ����)
		 * 
		 * ����ϰ� ���� �ܼ� �Է� : 10
		 * 9 ������ ���ڸ� �Է����ּ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ϰ� ���� �ܼ� �Է� : ");
		int num = sc.nextInt();
		
		if (num <= 9) {
			System.out.println();			
			for (int i = num ; i <= 9 ; i++) {
				System.out.println("===== " + i + "�� =====");
				for (int j = 1 ; j <= 9 ; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
				System.out.println();
			}
			
		} else {
			System.out.println("9 ������ ���ڸ� �Է��� �ּ���.");
		}
		
		
	}

}
