package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Scanner sc = new Scanner(System.in);
	Student[] student;   // 배열선언
	public StudentFunction() {    // 생성자에서 초기화함!
		student  = new Student[3];  //배열할당
		
	}
	
	public int printMenu() {
		System.out.println("====== 학생 성적관리 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		System.out.println();
		return menu;
	}
	
	public void inputScore() {
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d번째 학생 정보 입력 ======%n", i+1);
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			System.out.println();
			
			student[i] = new Student();  // 까먹지말기~!~!~!~!~
			
			student[i].setName(name);
			student[i].setFirstScore(firstScore);
			student[i].setSecondScore(secondScore);
			
		}
	}
	
	public void printScore() {
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d번째 학생 정보 출력 ======%n", i+1);
			System.out.println(student[i].getName() + " 학생의 점수는");
			System.out.printf("1차 점수 : %d%n", student[i].getFirstScore());
			System.out.printf("2차 점수 : %d%n", student[i].getSecondScore());
			System.out.println();
			
		}
	}
	
	public void checkPass() {
		/*
		 * 문제가 좆나 이상한대,,,ㅣ,ㅣ,,.,...]]];;;;;;;;
		 * 
		 * 0. 재평가 여부는 1차, 2차가 각각 다르다. (둘중 하나만 재평가할수도잇음)
		 * 1. 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다.
		 * 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 한다.
		 * 3. 1차점수와 2차 점수의 평균이 60점 미만의 경우
		 *	  60점 미만의 과목에 대해서 재평가를 본다.
		 * 
		 */
		
//		if 1차점수 or 2차점수 < 40 재평가 대상입니ㅏㄷ
//		if 1차점수2차점수 평균 < 60, 60미만인 과목만 재평가
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d번째 학생 정보 출력 ======%n", i+1);
			
			int num1 = student[i].getFirstScore();
			int num2 = student[i].getSecondScore();
			double avg = (double)(num1+num2)/2;
			
			if ( num1 < 40 || num2 < 40) {
				System.out.printf("%s 학생은 재평가 대상자입니다.%n", student[i].getName());
			} else if (avg >= 60) {
				System.out.printf("%s 학생은 통과입니다.%n",student[i].getName());
			} else {
				if (num1 < 60) {
					System.out.printf("%s 학생은 1차 재평가 대상자입니다.%n",student[i].getName());
				}
				if (num2 < 60) {
					System.out.printf("%s 학생은 2차 재평가 대상자입니다.%n", student[i].getName());
				}
			}
			System.out.println();
		
			
//			
			
		}
		
		
	}
	
	public void printGoodBye() {
		
	}
	
	public void printExceptioin() {
		
	}
	
	
	
}
