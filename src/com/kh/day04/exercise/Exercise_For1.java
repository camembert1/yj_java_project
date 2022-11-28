package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1 ; i < num ; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.printf("%d = %d", num, sum+num);
		
	}

}
