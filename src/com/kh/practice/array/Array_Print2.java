package com.kh.practice.array;

public class Array_Print2 {

	public static void main(String[] args) {
		
		/*
		 * 배열출력1
		 * 길이가 10인 배열을 선언하고
		 * 1부터 10까지의 값을 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
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
