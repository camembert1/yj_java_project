package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		
		/*
		 * 반복문실습4
		 * 
		 * 사용자로부터 두 개의 값을 입력 받아
		 * 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 
		 * ex.
		 * 첫 번째 숫자 : 8                첫 번째 숫자 : 4               
		 * 두 번째 숫자 : 4                두 번째 숫자 : 8              
		 * 4 5 6 7 8                       4 5 6 7 8        
		 * 
		 * 첫 번째 숫자 : 9
		 * 두 번째 숫자 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 == 0 || num2 == 0) {
			System.out.println("1 이상의 숫자를 입력해 주세요.");
		} else {
			if (num1 >= num2) {
				for (int i = num2 ; i <= num1 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1 ; i <= num2 ; i++) {
					System.out.print(i + " ");
				}
			}
			
		}
		
		
	}

}
