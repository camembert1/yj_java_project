package com.kh.practice.array;

public class Array_Print2 {

	public static void main(String[] args) {
		
		/*
		 * �迭���2
		 * ���̰� 10�� �迭�� �����ϰ�
		 * 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		 * �������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		 * 
		 * ex.
		 * 10 9 8 7 6 5 4 3 2 1
		 */
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums.length-i;
			System.out.printf("%d ", nums[i]);
		}
		
		
	}

}
