package com.kh.day05.exercise;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.management.VMOption.Origin;

public class Exercise_Array {

	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.

		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 100;
			System.out.printf("%2d��° �� nums[%d] = %d%n", i + 1, i, nums[i]);
		}
	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!

		String[] words = { "����", "������", "Ű��", "���", "�ٳ���" };

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("�ٳ���")) {
				System.out.println(words[i]);
			}
		}

	}

	public void exercise3() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ� �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int sum = 0;

		System.out.print("���� ���� 5�� �Է� : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		double avg = (double) sum / nums.length;
		System.out.printf("��� : %.1f", avg);

	}

	public void exercise4() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int max = nums[0];

		System.out.print("���� ���� 5�� �Է� : ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.printf("�ִ� : %d", max);
		

	}
	
	public void exercise5() {
		/*
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		 * ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		char[] nums = new char[14];
	
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��Ͻʽÿ�(-����) > ");
		String idNum = sc.nextLine();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = idNum.charAt(i);
		}

		
		char[] copy =new char[14];
		//���� ����(���� ����� ������ ���� �ٲ� )
		
		for (int i = 0; i < copy.length; i++) {
			if(i < 8) {
				copy[i] = nums[i];
			} else {
				copy[i] = '*';				
			}
			System.out.print(copy[i]);
		}
		
	
		}
	}
