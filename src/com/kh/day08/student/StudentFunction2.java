package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction2 {
	Scanner sc = new Scanner(System.in);
	Student[] student;   // �迭����
	public StudentFunction2() {    // �����ڿ��� �ʱ�ȭ��!
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
			System.out.printf("====== %d��° �л� ���� ���2 ======%n", i+1);
			System.out.printf("%s �л��� ������%n", student[i].getName());
			System.out.printf("1�� ���� : %d%n", student[i].getFirstScore());
			System.out.printf("2�� ���� : %d%n", student[i].getSecondScore());
			System.out.println();
			
		}
	}
	
	public void checkPass() {
		/*
		 * 
		 * 1��, 2�� �� �� �ϳ��� 40�� �̸� >> ����, �����
		 * 1��, 2�� ��� 60�� �̻� >> ���
		 * 1��, 2�� ��� 60�� �̸�(����X) >> 60�� �̸��� ���� ���ؼ��� ����
		 * 
		 */
		System.out.println("========= ���� ���� Ȯ�� =========");

		for (int i = 0; i < student.length; i++) {
			
			String name = student[i].getName();
			int num1 = student[i].getFirstScore();
			int num2 = student[i].getSecondScore();
			double avg = (double)(num1+num2)/2;
			
			if (num1 < 40 || num2 < 40) {
				System.out.printf("%s �л��� ����� ������Դϴ�.%n", name);
			} else if(avg < 60) {
				int test = 1;
				if (num2 < 60) {
					test = 2;
				}
				System.out.printf("%s �л��� %d������ ����� ������Դϴ�.%n", name, test);
			} else {
				System.out.printf("%s �л��� ����ϼ̽��ϴ�.%n", name);
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



