package com.kh.day04.exercise;

public class Exercise_ForDouble1 {

	public static void main(String[] args) {

		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 2 ; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		} 
		
		System.out.println();
		
		for(int i = 0 ; i <=23 ; i++) {
			for(int j = 0 ; j <= 59 ; j++) {
				System.out.printf("%02d½Ã %02dºÐ\n", i, j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1 ; i <=10 ; i++) {
			for(int j = 1 ; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i <=10 ; i++) {
			for(int j = 10 ; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
