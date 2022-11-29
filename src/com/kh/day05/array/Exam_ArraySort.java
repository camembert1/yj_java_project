package com.kh.day05.array;

import java.util.Arrays;

public class Exam_ArraySort {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 23;
		System.out.printf("num1 : %d, num2 : %d%n", num1, num2);
		
		// num1�� num2 �ٲٱ�
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1 : %d, num2 : %d%n", num1, num2);
		
		// 1, 2, 3���� �ٲٱ�
		int[] nums = {2, 1, 3};
		tmp = nums[0];
		nums[0] = nums[1];
		nums[1] = tmp;
		System.out.println(Arrays.toString(nums));
		
		// 3, 2, 1�� �ٲٱ�
		tmp = nums[0];
		nums[0] = nums[2];
		nums[2] = tmp;
		System.out.println(Arrays.toString(nums));
		
	}

}
