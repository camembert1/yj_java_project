package com.kh.day13.socket.baseball;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		
		int[] numbers = new int[3];
		
		//����, �ߺ�����
		for (int i = 0; i < numbers.length; i++) {
			
			int num = (int)(Math.random()*9)+1;
			
			Arrays.sort(numbers);
			if(Arrays.binarySearch(numbers, num) < 0) {
				numbers[0] = num;
				// �̷��Ը� �θ� ������ [1] < [2]�� ����� ����
				// ���� ���� �ʿ�
			} else {
				i--;
			}

		}
		shuffle(numbers);
		System.out.printf("���� %d %d %d%n", numbers[0], numbers[1], numbers[2]);
		
		String strNum = "624";
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = strNum.charAt(i) - '0';

		}
		System.out.printf("���� %d %d %d%n", numbers[0], numbers[1], numbers[2]);
		
	}
	
	public static void shuffle(int[] numbers) {
		
		for (int i = 0; i < 5; i++) {
			int n = (int)(Math.random()*3);
			int tmp = numbers[0];
			numbers[0] = numbers[n];
			numbers[n] = tmp;
		}
	}
}
