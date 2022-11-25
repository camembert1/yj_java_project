package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {

		/*
		 * 삼항연산자 - 굳이 if문을 쓰지 않아도 되는 간단한 상황에 사용
		 * 항목이 3개
		 * (조건식) ? 참일 때 : 거짓일 때;
		 *  - 조건식은 반드시 true or false를 반환
		 *  - 비교/논리연산자 주로 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요. > ");
		int input = sc.nextInt();
		
		String result = (input%2==0) ? input + "은(는) 짝수입니다." : input + "은(는) 홀수입니다.";
		
		System.out.println(result);
	}

}
