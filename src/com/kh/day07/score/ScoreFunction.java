package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	
	Scanner sc = new Scanner(System.in);
	private int kor = 0, eng = 0, math = 0; // �������
//	public int choice = 0;
	//private ������ �ΰ��ϴϱ� ��
	
	public int printMenu() {
		System.out.println("====== ���� �޴� =======");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void input() {
		System.out.printf("%n====== ���� �Է� =======%n");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
		
		System.out.println();
	}
	
	public void print() {
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
	
	public void end() {
		System.out.println();
		System.out.println("Good Bye~");
	}
	
	public void except() {
		System.out.printf("%n1 ~ 3 ������ ���� �Է��� �ּ���!!%n%n");

	}

}
