package com.kh.day07.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise_Lotto {

	public void Exercise_Lotto() {
		
		// 로또 번호 자동 생성기 프로그램, (중복 없이) 추출하기!!
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 몇개? 6개!!
		// 로또 번호의 범위는 1~45숫자!
		
		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for (int j = 0; j < 6; j++) {
			lotto[j] = rand.nextInt(45)+1;
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public void Exercise_Lotto2() {
		// 중복제거
		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int randNum = (rand.nextInt(45)+1);
			boolean bool = false;
			
			for (int j = 0; j < lotto.length; j++) {
				if (randNum == lotto[j]) {
					bool = true;
					
					break;
				}
			}
			
			if (bool) {
				i--;
				continue;
			}
			
			lotto[i] = randNum;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	
	public void Exercise_Lotto3() {
		// 중복제거 - 쌤방법
		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (rand.nextInt(45)+1);
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(lotto);  // 버블정렬로 해보기!
		System.out.println(Arrays.toString(lotto));
		
	}

}
