package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {

		/*
		 * 별찍기3
		 * 
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex.
		 * 정수 입력 : 4
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
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
