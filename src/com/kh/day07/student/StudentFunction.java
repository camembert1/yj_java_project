package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	// int kor eng math�� studentŬ������ �ѱ� ����~
	
	Scanner sc = new Scanner(System.in);
	
	Student student;
	public StudentFunction() {
		student = new Student();
		// this.student��� �ص� �� �ٵ� ����~ �򰥸� �� �����ϱ�
		// �� ���� ���� �� ���� ���� ������?
		// ���� �־ �Ǳ� �Ǵµ� ������ ���ҿ� �°�!
		// ���� ��ü �ʱ�ȭ�� ������ �ȿ��� �ؾ���!
		// ��ü���������� ���α׷����ϱ�!!
	}
	
	
	/**
	 * �л����� ���α׷� �޴� ���
	 * @return choice
	 */
	public int printMenu() {
		System.out.println("====== �л� �������� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	/**
	 * �л� ���� �Է�
	 */
	public void input() {
		System.out.println("========== �л� ���� �Է� ==========");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		// student = new Student(name, kor, eng, math);
		// setter�޼ҵ带 ������ �̰� �� ��
		
		// set�޼ҵ� �� �� �̷��� �Ѵ�!! ���� ��ü ���� ���ϰ�!!
		// ��ü �ѹ��� �����Ϸ��� ��!!
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		
		System.out.println();
	}
	
	
	/**
	 * �л� ���� ���
	 */
	public void print() {
		System.out.println("========== �л� ���� ��� ==========");
		System.out.printf("%s �л��� ����%n", student.getName());
		System.out.printf("���� ���� : %d%n", student.getKor());
		System.out.printf("���� ���� : %d%n", student.getEng());
		System.out.printf("���� ���� : %d%n", student.getMath());
		System.out.println();
	}
	

	public void end() {}
	public void except() {}

}
