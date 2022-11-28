package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {

		/*
		 * 별찍기2
		 * 
		 * 다음과 같은 실행 예제를 구현하세요.
		 * 
		 * ex.
		 * 정수 입력 : 4
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			for(int j = num ; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
