package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		
		// ���� �� �� ������!!

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		for(;;) {
			System.out.println("===== ���� �� �� ������ =====");
			int coin = (random.nextInt(2)+1);
			System.out.print("���ڸ� �Է����ּ���. (1. �ո� / 2. �޸�) > ");
			int num = sc.nextInt();
			if (!(num == 1 || num == 2)) {
				System.out.println("1 �Ǵ� 2�� �Է��� �ּ���.\n");
				continue;
			}
			
			System.out.println(coin == num ? "�������ϴ�.\n" : "Ʋ�Ƚ��ϴ�.\n");
			
		}
		
		
		
		
	}

}
