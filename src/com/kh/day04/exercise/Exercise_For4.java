package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 
								
		
		if (1<=num && num<=9) {
			for (int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
			
		} else {
			System.out.println("1 ~ 9 ������ ����� �Է��ؾ� �մϴ�.");
		}
		
		
		
	}

}
