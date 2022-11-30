package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void practice1() {

		
		while (true) {
			
			try {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("�������� �Է��Ͻÿ� : ");
				int num1 = sc.nextInt();
				System.out.print("�������� �Է��Ͻÿ� : ");
				int num2 = sc.nextInt();
				System.out.println("�����帱�Կ�^^");
				int result = num1/num2;
				System.out.printf("%n���� %d�Դϴ�~", result);
				
				break;
				
			} catch(ArithmeticException e) {
				
				System.out.printf("%n0���� ������ �ȵſ�!!%n");
				System.out.printf("%n=====================%n%n");
				
							
			} 
			
		}
		
	}
	
	public void practice2() {
		
		/*
		 * ���� 3���� �Է��ϼ���
		 * 0>>5
		 * 1>>R
		 * ������ �ƴմϴ�. �ٽ� �Է��ϼ���!
		 * 1>>4
		 * 2>>6
		 * ���� 15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���");
		
		
		int sum = 0;
		int num = 0;
		
		for (int i = 0; i < 3; i++) {
			
			try {
				System.out.printf("%d>>", i);
				num = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next(); // �߸� �Էµ� ���ڸ� ����!
						   //������ �������� �ʾ����Ƿ� �׳� �����
				
				i--;	   // ���� i++�� ������ ���� �̸� ����ߵ�~!
				
				continue;  // �ؿ� �ִ� sum~ �ǳʶٱ� ����!
				
			}
			sum += num;
			
		}
		
		System.out.printf("���� %d", sum);
		
		
		
	}
	
}
