package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {

		//while���� �̿��Ͽ� 1~100������ Ȧ���� ���� ����Ͻÿ�.
				int sum = 0;
				
				int i = 1;
				while (i <= 100) {
					sum+=i;
					i+=2;
				}
			
				System.out.print(sum);

	}

	public void exercise2() {


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

	public void exercise3() {
		

		/*
		 * while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		 * -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		 * 
		 * ���� �ϳ� �Է� : 3
		 * ���� �ϳ� �Է� : 4
		 * ���� �ϳ� �Է� : 7
		 * ���� �ϳ� �Է� : -1
		 * �Է��Ͻ� ���� ���� : 14
		 */
		
		// ���ѹݺ����ε� �غ���!
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		int count = 0;
		
		// 1
//		while (i != -1) {
//			System.out.print("���� �ϳ� �Է� : ");
//			i = sc.nextInt();
//			sum += i;
//			count+=1;
//		System.out.printf("�Է��Ͻ� ���� ���� : %d\n", sum+1);
//		System.out.printf("������ ������ %d���̸� ����� %f�Դϴ�.", count-1, (float)(sum+1)/(count-1));
//		}
		
		// 2 ���ѹݺ�
		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			i = sc.nextInt();
			if (i == -1) break;
			sum += i;
			count+=1;
			
		}
		System.out.printf("�Է��Ͻ� ���� ���� : %d\n", sum);
		
	}

}
