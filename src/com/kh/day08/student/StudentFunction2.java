package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction2 {
	Scanner sc = new Scanner(System.in);
	Student[] student;   // 배열선언
	public StudentFunction2() {    // 생성자에서 초기화함!
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
			System.out.printf("====== %d번째 학생 정보 출력2 ======%n", i+1);
			System.out.printf("%s 학생의 점수는%n", student[i].getName());
			System.out.printf("1차 점수 : %d%n", student[i].getFirstScore());
			System.out.printf("2차 점수 : %d%n", student[i].getSecondScore());
			System.out.println();
			
		}
	}
	
	public void checkPass() {
		/*
		 * 
		 * 1차, 2차 둘 중 하나라도 40점 미만 >> 과락, 재시험
		 * 1차, 2차 평균 60점 이상 >> 통과
		 * 1차, 2차 평균 60점 미만(과락X) >> 60점 미만인 과목에 대해서만 재평가
		 * 
		 */
		System.out.println("========= 재평가 여부 확인 =========");

		for (int i = 0; i < student.length; i++) {
			
			String name = student[i].getName();
			int num1 = student[i].getFirstScore();
			int num2 = student[i].getSecondScore();
			double avg = (double)(num1+num2)/2;
			
			if (num1 < 40 || num2 < 40) {
				System.out.printf("%s 학생은 재시험 대상자입니다.%n", name);
			} else if(avg < 60) {
				int test = 1;
				if (num2 < 60) {
					test = 2;
				}
				System.out.printf("%s 학생은 %d차시험 재시험 대상자입니다.%n", name, test);
			} else {
				System.out.printf("%s 학생은 통과하셨습니다.%n", name);
			}
		}
		System.out.println();

		
	
		
		
	}
	
	public void printGoodBye() {
		System.out.println("Good Bye~");
	}
	
	
	public void printExceptioin() {
		System.out.printf("%n1 ~ 3 사이의 수를 입력해 주세요!!%n%n");
		
	}
	
	
	
}



