package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortInsertion {

	public static void main(String[] args) {

		/*
		 * ���� �˰���
		 * 1. ���� ����
		 * 2. ���� ����
		 * 3. ���� ����
		 * 
		 * ���������̶�?
		 * ���� �˰��� �߿� �ϳ��̸鼭
		 * ���� �����ϰ� �⺻�� �Ǵ� �˰���
		 * �迭�� n�� �ε��� ���� 0������ n-1������ ��!
		 */
		
		int[] nums = {2, 5, 4, 1, 3};
		
//		// ���� �����Ϸ����� �̰� �ƴϴ�~~
//		for (int j = 1; j < nums.length; j++) {
//			for (int i = 0; i < nums.length-1; i++) {
//				if (nums[i] > nums[i+1]) {
//					int tmp = nums[i];
//					nums[i] = nums[i+1];
//					nums[i+1] = tmp;
//				} 
//			}
//			
//		}
		
		// ���� �����Ϸ�����! << �̵��� ������ �� �ٽ� �Ĳ��� ����
		
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j > 0; j--) {
				if (nums[j-1] > nums[j]) {
					int tmp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = tmp;
				} 
			}
		}
		
		System.out.println(Arrays.toString(nums));
		

	}

}
