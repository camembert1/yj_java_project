package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		

	//������ �Է� �޾� 1~9�϶���, 1~9�������̤� �Է��ϼž�~
		

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(;;) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt(); 
			
			
			if (1<=num && num<=9) {
				
				System.out.printf("===== %d�� =====\n", num);
				int i = 1;
				while (i <= 9) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
					i++;
				}
				count+=1;
				System.out.println();
				
			} else {
				System.out.println("1 ~ 9 ������ ����� �Է��ؾ� �մϴ�.\n");
			}
			
			if (count == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
		
		
	
		
	}

}
