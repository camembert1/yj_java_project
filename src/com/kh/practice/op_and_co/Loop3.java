package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		
		/*
		 * �ݺ����ǽ�3
		 * 
		 * 1���� ����ڿ��� �Է� ���� ������ �������� ����
		 * for���� �̿��Ͽ� ����ϼ���.
		 * 
		 * ex.
		 * ������ �ϳ� �Է��ϼ��� : 8
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 1 ; i < num ; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		
		System.out.print(num);
		System.out.println(" = " + (sum+num));
			
		
		
	}

}
