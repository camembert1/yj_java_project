package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Scanner sc = new Scanner(System.in);
	Student[] student;   // �迭����
	public StudentFunction() {    // �����ڿ��� �ʱ�ȭ��!
		student  = new Student[3];  //�迭�Ҵ�
		
	}
	
	public int printMenu() {
		System.out.println("====== �л� �������� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		System.out.println();
		return menu;
	}
	
	public void inputScore() {
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d��° �л� ���� �Է� ======%n", i+1);
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.print("2�� ���� �Է� : ");
			int secondScore = sc.nextInt();
			System.out.println();
			
			student[i] = new Student();  // ���������~!~!~!~!~
			
			student[i].setName(name);
			student[i].setFirstScore(firstScore);
			student[i].setSecondScore(secondScore);
			
		}
	}
	
	public void printScore() {
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d��° �л� ���� ��� ======%n", i+1);
			System.out.println(student[i].getName() + " �л��� ������");
			System.out.printf("1�� ���� : %d%n", student[i].getFirstScore());
			System.out.printf("2�� ���� : %d%n", student[i].getSecondScore());
			System.out.println();
			
		}
	}
	
	public void checkPass() {
		/*
		 * ������ ���� �̻��Ѵ�,,,��,��,,.,...]]];;;;;;;;
		 * 
		 * 0. ���� ���δ� 1��, 2���� ���� �ٸ���. (���� �ϳ��� �����Ҽ�������)
		 * 1. ������ 40�� �̸��� ��� �������� ���� ����ڰ� �ȴ�.
		 * 2. 1�� ������ 2�� ������ ����� 60���� �Ѿ�� �Ѵ�.
		 * 3. 1�������� 2�� ������ ����� 60�� �̸��� ���
		 *	  60�� �̸��� ���� ���ؼ� ���򰡸� ����.
		 * 
		 */
		
//		if 1������ or 2������ < 40 ���� ����ԴϤ���
//		if 1������2������ ��� < 60, 60�̸��� ���� ����
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("====== %d��° �л� ���� ��� ======%n", i+1);
			
			int num1 = student[i].getFirstScore();
			int num2 = student[i].getSecondScore();
			double avg = (double)(num1+num2)/2;
			
			if ( num1 < 40 || num2 < 40) {
				System.out.printf("%s �л��� ���� ������Դϴ�.%n", student[i].getName());
			} else if (avg >= 60) {
				System.out.printf("%s �л��� ����Դϴ�.%n",student[i].getName());
			} else {
				if (num1 < 60) {
					System.out.printf("%s �л��� 1�� ���� ������Դϴ�.%n",student[i].getName());
				}
				if (num2 < 60) {
					System.out.printf("%s �л��� 2�� ���� ������Դϴ�.%n", student[i].getName());
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
