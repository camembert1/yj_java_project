package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;


public class MinMax {

	public static void main(String[] args) {
		
		/*
		 * �ִ��ּ����1
		 * 
		 * 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		 * 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
		 * �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		 * 
		 * ex.
		 * 5 3 2 7 4 8 6 10 9 10
		 * �ִ밪 : 10
		 * �ּҰ� : 2
		 */
		
		int[] nums = new int[10];
		
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = (random.nextInt(10)+1);
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.println();
		System.out.printf("�ִ� : %d%n", max);
		System.out.printf("�ּڰ� : %d", min);
		
	}

}
