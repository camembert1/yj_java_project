package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {

		/*
		 * �����4
		 * 
		 * ������ ���� ���� ������ �����ϼ���.
		 * 
		 * ex.
		 * ���� �Է� : 4
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			for (int k = 1 ; k <= ((2*num - 1) - (2*i - 1))/2 ; k++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j <= i*2 - 1 ; j++) {
				System.out.print("*");
			}
			for (int k = 1 ; k <= ((2*num - 1) - (2*i - 1))/2 ; k++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}

}
