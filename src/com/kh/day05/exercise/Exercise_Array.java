package com.kh.day05.exercise;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.management.VMOption.Origin;

public class Exercise_Array {

	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 100;
			System.out.printf("%2d번째 값 nums[%d] = %d%n", i + 1, i, nums[i]);
		}
	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!

		String[] words = { "딸기", "복숭아", "키위", "사과", "바나나" };

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("바나나")) {
				System.out.println(words[i]);
			}
		}

	}

	public void exercise3() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int sum = 0;

		System.out.print("양의 정수 5개 입력 : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		double avg = (double) sum / nums.length;
		System.out.printf("평균 : %.1f", avg);

	}

	public void exercise4() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 제일 큰 수를 출력하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int max = nums[0];

		System.out.print("양의 정수 5개 입력 : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.printf("최댓값 : %d", max);
		

	}
	
	public void exercise5() {
		/*
		 * 사용자에게 주민번호를 입력 받은 후
		 * 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		char[] nums = new char[14];
	
		System.out.print("주민등록번호를 입력하십시오(-포함) > ");
		String idNum = sc.nextLine();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = idNum.charAt(i);
		}

		
		char[] copy =new char[14];
		//깊은 복사(얕은 복사는 원본도 같이 바뀜 )
		
		for (int i = 0; i < copy.length; i++) {
			if(i < 8) {
				copy[i] = nums[i];
			} else {
				copy[i] = '*';				
			}
			System.out.print(copy[i]);
		}
		
	
		}
	}
