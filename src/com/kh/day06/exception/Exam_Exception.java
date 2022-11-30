package com.kh.day06.exception;

import java.util.Scanner;

public class Exam_Exception {

	public static void main(String[] args) {
		
	
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력해 주세요 : ");
			int num1 = sc.nextInt();
			System.out.print("정수를 하나 더 입력해 주세요 : ");
			int num2 = sc.nextInt();
			System.out.println("나눠드릴게요^^");
			int result = num1/num2;
			System.out.printf("%n몫은 %d입니다~", result);
			
		} catch(ArithmeticException e) {
				
			System.out.println("0으로 나누면 안돼요!!");
				
		} 
	
	
	
	
	}

}
