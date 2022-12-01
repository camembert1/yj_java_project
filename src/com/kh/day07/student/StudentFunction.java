package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	// int kor eng math를 student클래스로 넘길 거임~
	
	Scanner sc = new Scanner(System.in);
	
	Student student;
	public StudentFunction() {
		student = new Student();
		// this.student라고 해도 됨 근데 굳이~ 헷갈릴 거 없으니까
		// 왜 위에 같이 안 적고 여기 따로함?
		// 저기 넣어도 되긴 되는데 생성자 역할에 맞게!
		// 원래 객체 초기화는 생성자 안에서 해야지!
		// 객체지향적으로 프로그래밍하기!!
	}
	
	
	/**
	 * 학생관리 프로그램 메뉴 출력
	 * @return choice
	 */
	public int printMenu() {
		System.out.println("====== 학생 성적관리 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	/**
	 * 학생 성적 입력
	 */
	public void input() {
		System.out.println("========== 학생 정보 입력 ==========");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		// student = new Student(name, kor, eng, math);
		// setter메소드를 쓸때는 이거 안 씀
		
		// set메소드 쓸 댄 이렇게 한다!! 새로 객체 생성 안하고!!
		// 객체 한번만 생성하려고 씀!!
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		
		System.out.println();
	}
	
	
	/**
	 * 학생 성적 출력
	 */
	public void print() {
		System.out.println("========== 학생 정보 출력 ==========");
		System.out.printf("%s 학생의 성적%n", student.getName());
		System.out.printf("국어 성적 : %d%n", student.getKor());
		System.out.printf("영어 성적 : %d%n", student.getEng());
		System.out.printf("수학 성적 : %d%n", student.getMath());
		System.out.println();
	}
	

	public void end() {}
	public void except() {}

}
