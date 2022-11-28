package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Multiplication_Table1 {

	public static void main(String[] args) {
		
		/*
		 * ���������1
		 * 
		 * ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		 * 
		 * ex.
		 * ����ϰ� ���� �ܼ� �Է� : 4
		 * ===== 4�� =====
		 * 4 * 1 = 4
		 * 4 * 2 = 8
		 * 4 * 3 = 12
		 * 4 * 4 = 16
		 * 4 * 5 = 20
		 * 4 * 6 = 24
		 * 4 * 7 = 28
		 * 4 * 8 = 32
		 * 4 * 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����ϰ� ���� �ܼ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num + " * " + i + " = " + (num*i) );
		}
		
	}

}
