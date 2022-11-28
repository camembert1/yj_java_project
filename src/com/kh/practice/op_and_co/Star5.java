package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {

		/*
		 * 별찍기5
		 * 
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			if (i == 1 || i == num) {
				for (int j = 1 ; j <= num ; j++) {
					System.out.print("*");
				} 
				System.out.println();
			} else {
				for (int j = 1 ; j <= 1 ; j++) {
					System.out.print("*");
				}
				
				for (int j = 3 ; j <= num ; j++) {
					System.out.print(" ");
				}
				
				for (int j = 1 ; j <= 1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
	}

}
