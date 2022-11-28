package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {
		
		/*
		 * System.out.println();에서
		 * 정수 + 문자열 -> 문자열
		 * System.out.println(1 + "1");
		 * 
		 */

		System.out.println(1 + "1");
		
		// 문자 + 문자 -> 문자
		System.out.println('1' + '1');
		// 1은 아스키코드로 49, 결과값 98도 문자는 맞음~!~!
		
		// 정수 + 정수 +문자열 + 정수
		System.out.println(3 + 3 +"abc"+ 5);
		// 최종적으론 문자열이 되는데 앞의 정수 두 개는 숫자로 계산됨
		
		// printf에 대하여 알아보자
		// println, print -> 줄바꿈의 차이
		// printf
		System.out.printf("정수 출력", 1);
		System.out.printf("\n정수 출력 : %d", 1);
		System.out.printf("\n문자열 출력 : %s", "Hello World!");
		
	}

}
