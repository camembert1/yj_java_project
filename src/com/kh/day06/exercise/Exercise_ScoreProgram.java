package com.kh.day06.exercise;

import java.util.Scanner;


public class Exercise_ScoreProgram {

	public static void main(String[] args) {

	

		int kor = 0, eng = 0, math = 0;
		
		ESCAPE :  // break 뒤에 사용해 프로그램을 완전히 종료할 수 있게 함
			      // 굳이ESCAPE가 아니어도 됨 아무거나 상관ㄴㄴ 맞춰주기만 하면 됨
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 메인 메뉴 =======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			
			
			switch (select) {
				case 1:
					System.out.printf("%n====== 성적 입력 =======%n");
					System.out.print("국어 : ");
					kor = sc.nextInt();
					System.out.print("영어 : ");
					eng = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
					
					System.out.println();
					break;
					
				case 2:
					System.out.printf("%n====== 성적 출력 =======%n");
					System.out.printf("국어 : %d", kor);
					System.out.printf("%n영어 : %d", eng);
					System.out.printf("%n수학 : %d", math);
					System.out.println();
					
					int sum = kor + eng + math;
					double avg = (double)sum/3;
					System.out.printf("%n총점 : %d", sum);
					System.out.printf("%n평균 : %.2f", avg);
					System.out.printf("%n%n");
					
					break;
					
				case 3:
					System.out.println();
					System.out.println("Good Bye~");
					
					break ESCAPE;
					
				default :
					System.out.printf("%n1 ~ 3 사이의 수를 입력해 주세요!!%n%n");
					break;
					
				
			}
			
			
		}
		
		
		

		
		
	}
	

}
