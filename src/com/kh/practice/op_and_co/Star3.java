package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {

		/*
		 * �����3
		 * 
		 * ������ ���� ���� ������ �����ϼ���.
		 * 
		 * ex.
		 * ���� �Է� : 4
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			
			for(int k = num ; k > i ; k--) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
