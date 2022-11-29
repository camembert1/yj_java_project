package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortSelection {

	public static void main(String[] args) {
		
		/*
		 * 정렬 알고리즘
		 * 1. 삽입 정렬
		 * 2. 선택 정렬
		 * 3. 버블 정렬
		 * 
		 * 선택정렬이란?
		 * 배열을 전부 검색하여 최솟값을 고르고
		 * 왼쪽부터 채워나가는 방식의 정렬
		 * 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		 * 데이터 양이 많을 때 급격한 성능 저하를 보임.
		 * 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함.
		 */
		
		int[] arrs = {2, 5, 4, 1, 3};
		int min; // 인덱스값 저장할 거임 1의 인덱스값 3이 저장됨
		
		for (int i = 0; i < arrs.length; i++) {
			min = i; // 가장 작을 때 인덱스 값
			for (int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
				System.out.printf("i = %d, j = %d, min = %d : ", i, j, min);
				System.out.println(Arrays.toString(arrs));
				
			}
			int tmp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = tmp;
			
			System.out.printf("			");
			System.out.println(Arrays.toString(arrs));
			System.out.println();
		}
		/*
		 * 기준!작은거잇어??바꿔.
		 * i=0일때,
		 * 1, 5, 4, 2, 3 //첫번째 결과
		 * i=1일때,
		 * 1, 2, 4, 5, 3 // 두번째 결과
		 */
		
		
	}

}
