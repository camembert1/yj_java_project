package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {

	public static void main(String[] args) {

		/*
		 * while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		 * -1이 입력되면 입력한 수의 합을 출력하시오.
		 * 
		 * 정수 하나 입력 : 3
		 * 정수 하나 입력 : 4
		 * 정수 하나 입력 : 7
		 * 정수 하나 입력 : -1
		 * 입력하신 수의 합은 : 14
		 */
		
		// 무한반복으로도 해보기!
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		int count = 0;
		
		// 1
//		while (i != -1) {
//			System.out.print("정수 하나 입력 : ");
//			i = sc.nextInt();
//			sum += i;
//			count+=1;
//		System.out.printf("입력하신 수의 합은 : %d\n", sum+1);
//		System.out.printf("정수의 개수는 %d개이며 평균은 %f입니다.", count-1, (float)(sum+1)/(count-1));
//		}
		
		// 2 무한반복
		while (true) {
			System.out.print("정수 하나 입력 : ");
			i = sc.nextInt();
			if (i == -1) break;
			sum += i;
			count+=1;
			
		}
		System.out.printf("입력하신 수의 합은 : %d\n", sum);
		
		
	}

}
