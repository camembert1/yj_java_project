package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		

	//정수를 입력 받아 1~9일때만, 1~9사이으이ㅣ 입력하셔야~
		

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(;;) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt(); 
			
			
			if (1<=num && num<=9) {
				
				System.out.printf("===== %d단 =====\n", num);
				int i = 1;
				while (i <= 9) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
					i++;
				}
				count+=1;
				System.out.println();
				
			} else {
				System.out.println("1 ~ 9 사이의 양수를 입력해야 합니다.\n");
			}
			
			if (count == 3) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
	
		
	}

}
