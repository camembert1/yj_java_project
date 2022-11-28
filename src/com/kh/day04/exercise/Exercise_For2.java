package com.kh.day04.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		
		
		
		
		int num = 10;
		int sum = 0;
		
		for (int i = 1 ; i < num ; i++) {
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf("%d = %d", num, sum+num);
		
		
	}

}
