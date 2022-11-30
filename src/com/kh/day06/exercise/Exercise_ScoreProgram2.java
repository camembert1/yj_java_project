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
		System.out.println("====== ���� �޴� =======");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%n====== ���� �Է� =======%n");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
		
		System.out.println();
	}
	
	public static void print() {
		System.out.printf("%n====== ���� ��� =======%n");
		System.out.printf("���� : %d", kor);
		System.out.printf("%n���� : %d", eng);
		System.out.printf("%n���� : %d", math);
		System.out.println();
		
		int sum = kor + eng + math;
		double avg = (double)sum/3;
		System.out.printf("%n���� : %d", sum);
		System.out.printf("%n��� : %.2f", avg);
		System.out.printf("%n%n");
	}
	
	public static void end() {
		System.out.println();
		System.out.println("Good Bye~");
	}
	
	public static void except() {
		System.out.printf("%n1 ~ 3 ������ ���� �Է��� �ּ���!!%n%n");
	}
	
	

}
