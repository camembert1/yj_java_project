package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요. > ");
		int num = sc.nextInt();
		
//		if (num % 2 == 0) {
//			System.out.println(num + "은(는) 짝수입니다.");
//		} else {
//			System.out.println(num + "은(는) 홀수입니다.");
//		}
		
		String result = "";
		if (num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		

		
		
	}

}
