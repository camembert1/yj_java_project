package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Positive_or_Negative1 {

	public static void main(String[] args) {
		
		/*
		 * �����Ǻ�1
		 * 
		 * Ű����� �Է� ���� �ϳ��� ������
		 * ����̸� ������١�
		 * ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		 * 
		 * ex.
		 * ���� : -9
		 * ����� �ƴϴ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}
		
	}

}
