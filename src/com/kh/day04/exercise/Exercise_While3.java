package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {

		/*
		 * while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		 * -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		 * 
		 * ���� �ϳ� �Է� : 3
		 * ���� �ϳ� �Է� : 4
		 * ���� �ϳ� �Է� : 7
		 * ���� �ϳ� �Է� : -1
		 * �Է��Ͻ� ���� ���� : 14
		 */
		
		// ���ѹݺ����ε� �غ���!
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		int count = 0;
		
		// 1
//		while (i != -1) {
//			System.out.print("���� �ϳ� �Է� : ");
//			i = sc.nextInt();
//			sum += i;
//			count+=1;
//		System.out.printf("�Է��Ͻ� ���� ���� : %d\n", sum+1);
//		System.out.printf("������ ������ %d���̸� ����� %f�Դϴ�.", count-1, (float)(sum+1)/(count-1));
//		}
		
		// 2 ���ѹݺ�
		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			i = sc.nextInt();
			if (i == -1) break;
			sum += i;
			count+=1;
			
		}
		System.out.printf("�Է��Ͻ� ���� ���� : %d\n", sum);
		
		
	}

}
