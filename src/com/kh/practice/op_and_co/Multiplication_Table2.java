package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Multiplication_Table2 {

	public static void main(String[] args) {
		
		/*
		 * 구구단출력2
		 * 
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 들어오면
		 * “9 이하의 숫자만 입력해주세요”를 출력하세요.
		 * 
		 * ex.
		 * 출력하고 싶은 단수 입력 : 4 
		 * ===== 4단 ===== 
		 * ===== 5단 =====
		 * ===== 6단 =====
		 * ===== 7단 =====
		 * ===== 8단 =====
		 * ===== 9단 =====
		 * (해당 단의 내용들은 길이 상 생략)
		 * 
		 * 출력하고 싶은 단수 입력 : 10
		 * 9 이하의 숫자만 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력하고 싶은 단수 입력 : ");
		int num = sc.nextInt();
		
		if (num <= 9) {
			System.out.println();			
			for (int i = num ; i <= 9 ; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1 ; j <= 9 ; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
				System.out.println();
			}
			
		} else {
			System.out.println("9 이하의 숫자만 입력해 주세요.");
		}
		
		
	}

}
