package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortInsertion {

	public static void main(String[] args) {

		/*
		 * 정렬 알고리즘
		 * 1. 삽입 정렬
		 * 2. 선택 정렬
		 * 3. 버블 정렬
		 * 
		 * 삽입정렬이란?
		 * 정렬 알고리즘 중에 하나이면서
		 * 가장 간단하고 기본이 되는 알고리즘
		 * 배열의 n번 인덱스 값을 0번에서 n-1번까지 비교!
		 */
		
		int[] nums = {2, 5, 4, 1, 3};
		
//		// 쌤이 설명하려던게 이게 아니다~~
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
		
		// 쌤이 설명하려던거! << 이따가 복습할 때 다시 꼼꼼히 보기
		
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
