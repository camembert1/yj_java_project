package com.kh.day05.array;

import java.util.Arrays;

public class Exam_Array {

	public static void main(String[] args) {
		
		// 선언, 할당, 초기화
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i+1)*10;
			System.out.printf("%2d번째 값 nums[%d] = %d%n", i+1, i, nums[i]);
		}
		
		System.out.println();
		System.out.printf("배열의 크기 : %d%n", nums.length);
		System.out.println(Arrays.toString(nums));
		
	}

}
