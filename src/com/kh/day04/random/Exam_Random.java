package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {

		Random rand = new Random(); // ������ �����ϱ� ���� ���� ��ɾ�
		
		for(int i = 0 ; i < 1 ; i++) {
			// nextInt(n) -> 0���� n-1������ ������ �� ����!
			// 1���� 10������ ���� �߿��� ������ ���� �̰� �ʹٸ�
			// nextInt(10)+1, �� +1�� ������ �����Ѵ�!!
			System.out.println(rand.nextInt(10)+1);
		}
			

			
		//ex 20���� 35������ �� �߿��� ������ ���� �̰� �ʹٸ�?
		
		for(int i = 0 ; i < 50 ;i++) {
			System.out.println(rand.nextInt(16)+20);
		}
		
		// 10���� 23������ �� �߿��� �����Ѥ���
		System.out.println(rand.nextInt(14)+10);
	}

}
