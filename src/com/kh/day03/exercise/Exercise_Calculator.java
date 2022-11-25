package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {

		// 두 개의 정수를 입력받고 연산자를 입력 받아 계산하는 계산기 프로그램 작성!
		
		// 정수를 입력해 주세요
		// 정수를 한 번 더 입력해 주세요
		// 연산자를 입력해 주세요(+, -, *, /, %)
		// 결과
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해 주세요. > ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 한 번 더 입력해 주세요. > ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력해 주세요.(+, -, *, /, %) > ");
		char operator = sc.next().charAt(0);
		
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			result = num1 % num2;
		}
		
		System.out.printf("결과 : %d %c %d = %d",num1, operator, num2, result);
	}

}
