package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��� �ּ���. > ");
		String name = sc.next();
		
		System.out.println("�¾ ���� �Է��� �ּ���. > ");
		int month = sc.nextInt();
		
		System.out.println("Ű�� �Է��� �ּ���. > ");
		double height = sc.nextDouble();
		                
		System.out.println("������ �Է��� �ּ���. > ");
		String gender = sc.next();
		                
		System.out.println("�ּҸ� �Է��� �ּ���. > ");
		sc.nextLine(); //���� ���Ÿ� ����~
		String address = sc.nextLine();
		
		System.out.printf("\n�̸��� %s�Դϴ�.\n",name);
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println("�ּҴ� " + address + "�Դϴ�.");
	
	}
}
