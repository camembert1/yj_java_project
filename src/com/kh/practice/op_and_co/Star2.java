package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {

		/*
		 * �����2
		 * 
		 * ������ ���� ���� ������ �����ϼ���.
		 * 
		 * ex.
		 * ���� �Է� : 4
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
