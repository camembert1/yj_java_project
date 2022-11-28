package com.kh.day04.exercise;

import java.util.Scanner;

public class Exam_CalculatorFor {

	public static void main(String[] args) {

		/*
		 * switch case문으로 계산기 만들어보기
		 * 두 개의 정수를 입력받고 
		 * 연산자를 입력 받아 계산하는 계산기 프로그램 작성!
		 * 
		 * 정수를 입력해 주세요
		 * 정수를 한 번 더 입력해 주세요
		 * 연산자를 입력해 주세요(+, -, *, /, %)
		 * 결과
		 */
		

		Scanner sc = new Scanner(System.in);
		int count = 0; //3번반복하고 멈추도록 하기 위함
		
		for(;;) {
			
			System.out.print("정수를 입력해 주세요. > ");
			int num1 = sc.nextInt();
			
			System.out.print("정수를 한 번 더 입력해 주세요. > ");
			int num2 = sc.nextInt();
			
			System.out.print("연산자를 입력해 주세요.(+, -, *, /, %) > ");
			char operator = sc.next().charAt(0);
			
			int result = 0;
			
			
			switch (operator) {
			
			case '+':
				result = num1 + num2;
				break;
				
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
			case '/':
				result = num1 / num2;
				break;
				
			case '%':
				result = num1 % num2;
				break;
				
			default:
				break;
			}
			
			System.out.printf("결과 : %d %c %d = %d\n\n", num1, operator, num2, result);
			count++;
			if(count == 3) {
				System.out.println("종료되었습니다.");
				break; // 3번만 반복하고 멈추도록!
			}
//			break; //무한반복문임에도 1번만 나옴!
			//break문에 조건을 걸어 원하는 때에 멈추게 할 수 있다!
			
		}

	}

}
