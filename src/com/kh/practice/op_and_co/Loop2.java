package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		
		/*
		 * �ݺ����ǽ�2
		 * 
		 * ����ڷκ��� �� ���� ���� �Է� �޾�
		 * 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 * 
		 * ex.
		 * 1�̻��� ���ڸ� �Է��ϼ��� : 4
		 * 4 3 2 1
		 * 
		 * 1�̻��� ���ڸ� �Է��ϼ��� : 0
		 * 1 �̻��� ���ڸ� �Է����ּ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = num ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է��� �ּ���.");
		}
		
		
	}

}
