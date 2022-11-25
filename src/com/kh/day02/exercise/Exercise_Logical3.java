package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical3 {

	public static void main(String[] args) {
		
		//입력 받은 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 단, 입력 받은 숫자는 변수 num에 초기화해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 > ");
		int num = sc.nextInt();
		
		boolean result = (1 < num) && (num < 100);
		System.out.println("1부터 100사이의 숫자인가 ? " + result);
		
	}
}
