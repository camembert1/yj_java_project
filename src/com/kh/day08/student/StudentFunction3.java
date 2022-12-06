package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction3 {
	Scanner sc = new Scanner(System.in);
	Student[] student;   // �迭����
	public StudentFunction3() {    // �����ڿ��� �ʱ�ȭ��!
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
		 *100���� �������� �Ͽ� ����� 40�� �̻�, ������ ��� 60�� �̻�//////
		 * 
		 */
		
//		if 1������ or 2������ < 40 ���� ����ԴϤ���
//		if 1������2������ ��� < 60, 60�̸��� ���� ����
		
		for (int i = 0; i < student.length; i++) {
			
			int num1 = student[i].getFirstScore();
			int num2 = student[i].getSecondScore();
			double avg = (num1 + num2) / (double)2;
			
			// 60���� or 40����
			if (avg >= 60) {
				// ���� �߻�
				// 1�� ���� 40�� �̸�
				// 2�� ���� 40�� �̸�
				if(num1 < 40) {
					System.out.printf("%s �л��� 1�� ���� ���� ������Դϴ�.%n", student[i].getName());
				} else if (num2 < 40) {
					System.out.printf("%s �л��� 2�� ���� ���� ������Դϴ�.%n", student[i].getName());

				} else {				
					System.out.printf("%s �л��� ����ϼ̽��ϴ�.%n", student[i].getName());
				}
				
			} else {
				// ��� ���� �����!
				// 1��o, 2��x
				// 1��x, 2��o
				// 1��x, 2��x
				if(num1 < 60) {
					System.out.println("1�� ���� ������Դϴ�.");
				}
				if(num2 < 60) {
					System.out.println("2�� ���� ������Դϴ�.");
				}
			}
		}
		System.out.println();
		
	
		
		
	}
	
	public void printGoodBye() {
		System.out.println("Good Bye~");
	}
	
	
	public void printExceptioin() {
		System.out.printf("%n1 ~ 3 ������ ���� �Է��� �ּ���!!%n%n");
		
	}
	
	
	
}



