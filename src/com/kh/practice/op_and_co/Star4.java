package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {

		/*
		 * 별찍기4
		 * 
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex.
		 * 정수 입력 : 4
		 *    *
		 *   ***
		 *  *****
		 * *******
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
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
