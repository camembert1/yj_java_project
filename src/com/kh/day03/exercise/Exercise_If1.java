package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		
		// 정수 하나를 입력 받아서 양수, 0, 음수인지 판별 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해 주세요. > ");
		int input = sc.nextInt();
		
		String result = "0";
		
		if (input > 0) {
			result = "양의 정수";
		} else if (input < 0) {
			result = "음의 정수";
		}
		
		System.out.printf("%s입니다.\n", result);
	}

}
