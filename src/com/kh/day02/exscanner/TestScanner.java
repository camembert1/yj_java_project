package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner ����ϱ�
		
		System.out.print("int ���� �Է����ּ��� > ");
		int input1 = sc.nextInt(); // �Է� ���� ���� ����
		System.out.println("�Է��� �� : " + input1);
		
		System.out.print("int ���� �� �� �� �Է��� �ּ��� > ");
		int input2 = sc.nextInt();
		System.out.println("�Է��� �� : " + input2);
		
		// print�� println ���� ln = ������ ������, �� �ѱ�
		// ȭ���� �Ȱ��� ������ �� ���� �����ϱ�!
		
		int result = input1 + input2;
		System.out.println("�� ���� ���� " + result + " �Դϴ�.");
		
//		sc.close();
		// ���� ��ĳ�� �� ��ٴ� �ڵ��ε� �� �ᵵ ��� ����, ���� ����
		//�߸� ������ �Է��� ���� �ʱ� ������~~ �� �� �Ƿ��� �װ� ���!
		
	}

}
