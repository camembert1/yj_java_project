package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortBubble {

	public static void main(String[] args) {
		
		/*
		 * 정렬 알고리즘
		 * 1. 삽입 정렬
		 * 2. 선택 정렬
		 * 3. 버블 정렬
		 * 
		 * 버블정렬이란?
		 * 인접한 두 개의 원소를 검사하여 정렬하는 방법
		 * 구현이 쉽다는 장점이 있고,
		 * 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		 * 기본적으로 다른 정렬에 비해 정렬 속도가 느리며,
		 * 역순으로 정렬할 때 가장 느림.
		 * 
		 * 우측 끝부터 고정, 가장 큰 수부터 채우는 방식!
		 */
		
		int[] arrs = {2, 5, 4, 1, 3};
		
		
		for (int i = 0; i < arrs.length-1; i++) {
			for (int j = 0; j < arrs.length-1-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int tmp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = tmp;
				}
				System.out.printf("i = %d, j = %d : ", i, j);
				System.out.println(Arrays.toString(arrs));
			}
		}
		
	}

}
