package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {

		Random rand = new Random(); // 난수를 생성하기 위해 적는 명령어
		
		for(int i = 0 ; i < 1 ; i++) {
			// nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴!
			// 1부터 10까지의 숫자 중에서 랜덤한 수를 뽑고 싶다면
			// nextInt(10)+1, 즉 +1로 범위를 조정한다!!
			System.out.println(rand.nextInt(10)+1);
		}
			

			
		//ex 20부터 35사이의 수 중에서 랜덤한 수를 뽑고 싶다면?
		
		for(int i = 0 ; i < 50 ;i++) {
			System.out.println(rand.nextInt(16)+20);
		}
		
		// 10부터 23사이의 수 중에서 랜덤한ㅅ수
		System.out.println(rand.nextInt(14)+10);
	}

}
