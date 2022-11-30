package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	
	static int kor = 0, eng = 0, math = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		ESCAPE :
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: 
					input();
					break;
				case 2: 
					print();
					break;
				case 3:
					end();
					break ESCAPE ;
				default : 
					except();
					break;
			}
		}
		
		
	}
	
	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 =======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%n====== 성적 입력 =======%n");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		System.out.println();
	}
	
	public static void print() {
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
	
	public static void end() {
		System.out.println();
		System.out.println("Good Bye~");
	}
	
	public static void except() {
		System.out.printf("%n1 ~ 3 사이의 수를 입력해 주세요!!%n%n");
	}
	
	

}
