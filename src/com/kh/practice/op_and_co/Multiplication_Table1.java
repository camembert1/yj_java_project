package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Multiplication_Table1 {

	public static void main(String[] args) {
		
		/*
		 * 구구단출력1
		 * 
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * 
		 * ex.
		 * 출력하고 싶은 단수 입력 : 4
		 * ===== 4단 =====
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
		
		System.out.print("출력하고 싶은 단수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num + " * " + i + " = " + (num*i) );
		}
		
	}

}
