package com.kh.day04.loop;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {

		//�Է��� ���� -1�� �� ������ ~~�Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 1;
		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			sum+=num;
			
		} while (num != -1);
		
		System.out.printf("�Է��� ���� ���� %d�Դϴ�.", sum);
		
	}

}
