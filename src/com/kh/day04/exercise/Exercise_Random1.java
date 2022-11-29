package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		
		// 동전 앞 뒤 맞히기!!

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		for(;;) {
			System.out.println("===== 동전 앞 뒤 맞히기 =====");
			int coin = (random.nextInt(2)+1);
			System.out.print("숫자를 입력해주세요. (1. 앞면 / 2. 뒷면) > ");
			int num = sc.nextInt();
			if (!(num == 1 || num == 2)) {
				System.out.println("1 또는 2를 입력해 주세요.\n");
				continue;
			}
			
			System.out.println(coin == num ? "맞혔습니다.\n" : "틀렸습니다.\n");
			
		}
		
		
		
		
	}

}
