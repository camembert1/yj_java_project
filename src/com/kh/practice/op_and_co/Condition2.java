package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {

			/*
			 * 조건판별2
			 * 
			 * 3개의 수를 키보드로 입력 받아
			 * 입력 받은 수가 모두 같으면 true,
			 * 아니면 false를 출력하세요.
			 * 
			 * ex.
			 * 입력1 : 5
			 * 입력2 : -8
			 * 입력3 : 5
			 * false
			 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
