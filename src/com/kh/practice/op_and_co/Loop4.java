package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		
		/*
		 * �ݺ����ǽ�4
		 * 
		 * ����ڷκ��� �� ���� ���� �Է� �޾�
		 * �� ������ ���ڸ� ��� ����ϼ���.
		 * ���� 1 �̸��� ���ڰ� �Էµƴٸ�
		 * ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		 * 
		 * ex.
		 * ù ��° ���� : 8                ù ��° ���� : 4               
		 * �� ��° ���� : 4                �� ��° ���� : 8              
		 * 4 5 6 7 8                       4 5 6 7 8        
		 * 
		 * ù ��° ���� : 9
		 * �� ��° ���� : 0
		 * 1 �̻��� ���ڸ� �Է����ּ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("1 �̻��� ���ڸ� �Է��� �ּ���.");
		} else {
			if (num1 >= num2) {
				for (int i = num2 ; i <= num1 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1 ; i <= num2 ; i++) {
					System.out.print(i + " ");
				}
			}
			
		}
		
		
	}

}
