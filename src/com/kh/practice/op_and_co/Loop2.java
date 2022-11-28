package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		
		/*
		 * 반복문실습2
		 * 
		 * 사용자로부터 한 개의 값을 입력 받아
		 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 
		 * ex.
		 * 1이상의 숫자를 입력하세요 : 4
		 * 4 3 2 1
		 * 
		 * 1이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = num ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		}
		
		
	}

}
