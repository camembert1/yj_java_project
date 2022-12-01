package com.kh.day07.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise_Lotto {

	public void Exercise_Lotto() {
		
		// �ζ� ��ȣ �ڵ� ������ ���α׷�, (�ߺ� ����) �����ϱ�!!
		// ��, ����� ������������ ����
		// �ζ� ��ȣ�� �? 6��!!
		// �ζ� ��ȣ�� ������ 1~45����!
		
		Random rand = new Random();
		
		int[] lotto = new int[6];
		
		for (int j = 0; j < 6; j++) {
			lotto[j] = rand.nextInt(45)+1;
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public void Exercise_Lotto2() {
		// �ߺ�����
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
		// �ߺ����� - �ܹ��
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
		Arrays.sort(lotto);  // �������ķ� �غ���!
		System.out.println(Arrays.toString(lotto));
		
	}

}
