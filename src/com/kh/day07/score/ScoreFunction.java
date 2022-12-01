package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	
	Scanner sc = new Scanner(System.in);
	private int kor = 0, eng = 0, math = 0; // 멤버변수
//	public int choice = 0;
	//private 점수는 민감하니까 ㅋ
	
	public int printMenu() {
		System.out.println("====== 메인 메뉴 =======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void input() {
		System.out.printf("%n====== 성적 입력 =======%n");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		System.out.println();
	}
	
	public void print() {
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
	}
	
	public void end() {
		System.out.println();
		System.out.println("Good Bye~");
	}
	
	public void except() {
		System.out.printf("%n1 ~ 3 사이의 수를 입력해 주세요!!%n%n");

	}

}
