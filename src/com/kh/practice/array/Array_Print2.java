package com.kh.practice.array;

public class Array_Print2 {

	public static void main(String[] args) {
		
		/*
		 * �迭���1
		 * ���̰� 10�� �迭�� �����ϰ�
		 * 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		 * ������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		 * 
		 * ex.
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.printf("%d ", nums[i]);
		}
		
		
	}

}
