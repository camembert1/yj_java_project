package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요. > ");
		int num = sc.nextInt();
		
		
		String result = "";
		if (num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		System.out.printf("%d은(는) %s입니다.", num, result);

	}

}
