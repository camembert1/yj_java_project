package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {

		// 누적합
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i < num; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.printf("%d = %d", num, sum + num);

	}

	public void exercise2() {

		// 누적합
		int num = 10;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf("%d = %d", num, sum + num);

	}

	public void exercise3() {
		
		// 구구단
		for (int i = 2; i <= 9; i++) {
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();

		}
	}

	public void exercise4() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (1 <= num && num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}

		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력해야 합니다.");
		}
	}

}
