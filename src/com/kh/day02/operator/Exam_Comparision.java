package com.kh.day02.operator;

public class Exam_Comparision {

	public static void main(String[] args) {
		System.out.println("비교연산자 예제");
		// 1 < 2 , 3 < 2 , 1 == 2 , 1 != 1
		// true, false, false, false
		// 비교연산자 :  두 값을 비교하는 관계연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함

		int num1 = 50, num2 = 30;
		
		boolean result = num1 < num2;
		System.out.println("(num1 < num2)의 결과 : " +  result);
		
		result = num1 > num2;
		System.out.println("(num1 > num2)의 결과 : " +  result);
		
		result = num1 == num2;
		System.out.println("(num1 == num2)의 결과 : " +  result);
		
		result = num1 != num2;
		System.out.println("(num1 != num2)의 결과 : " +  result);
		
		// 짝홀 판별 프로그램
		// 짝수란 무엇인가? 2로 나눴을 때 나머지가 0
		
		int num = 2;
		result = (num % 2 == 0);
		System.out.println("짝수인가요? " + result);
		// % 모듈러스, 나머지를 구하는 연산자
		// / 나누기, 몫을 구하는 연산자
 
	}
}
