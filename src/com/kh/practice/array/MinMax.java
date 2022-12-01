package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;


public class MinMax {

	public static void main(String[] args) {
		
		/*
		 * 최대최소출력1
		 * 
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * ex.
		 * 5 3 2 7 4 8 6 10 9 10
		 * 최대값 : 10
		 * 최소값 : 2
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
		System.out.printf("최댓값 : %d%n", max);
		System.out.printf("최솟값 : %d", min);
		
	}

}
