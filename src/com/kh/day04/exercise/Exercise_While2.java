package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		

	//정수를 입력 받아 1~9일때만, 1~9사이으이ㅣ 입력하셔야~
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 전역변수선언
								// 지역변수선언
		
		if (1<=num && num<=9) {
			
			int i = 1;
			while (i <= 9) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
				i++;
			}
			
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력해야 합니다.");
		}
		
	
		
	}

}
