package com.kh.practice.array;

import java.util.Scanner;

public class Array_Print3 {

	public static void main(String[] args) {
		
		/*
		 * �迭���3
		 * ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		 * 1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		 * 
		 * ex.
		 * ���� ���� : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] nums = new int[num];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.printf("%d ", nums[i]);
		}
		
		
	}

}
