package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void practice1() {

		
		while (true) {
			
			try {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("나뉨수를 입력하시오 : ");
				int num1 = sc.nextInt();
				System.out.print("나눗수를 입력하시오 : ");
				int num2 = sc.nextInt();
				System.out.println("나눠드릴게요^^");
				int result = num1/num2;
				System.out.printf("%n몫은 %d입니다~", result);
				
				break;
				
			} catch(ArithmeticException e) {
				
				System.out.printf("%n0으로 나누면 안돼요!!%n");
				System.out.printf("%n=====================%n%n");
				
							
			} 
			
		}
		
	}
	
	public void practice2() {
		
		/*
		 * 정수 3개를 입력하세요
		 * 0>>5
		 * 1>>R
		 * 정수가 아닙니다. 다시 입력하세요!
		 * 1>>4
		 * 2>>6
		 * 합은 15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		
		
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < 3; i++) {
			
			try {
				System.out.printf("%d>>", i);
				num = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 잘못 입력된 문자를 제거!
						   //변수에 저장하지 않았으므로 그냥 사라짐
				
				i--;	   // 위에 i++를 만나기 전에 미리 빼줘야됨~!
				
				continue;  // 밑에 있는 sum~ 건너뛰기 위함!
				
			}
			sum += num;
			
		}
		
		System.out.printf("합은 %d", sum);
		
		
		
	}
	
}
