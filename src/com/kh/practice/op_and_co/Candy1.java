package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Candy1 {

	public static void main(String[] args) {

		/*
		 * ��������1
		 * 
		 * ��� ����� ������ ���� ������������ �Ѵ�.
		 * �ο� ���� ���� ������ Ű����� �Է� �ް�
		 * 1�δ� �����ϰ� �������� ���� ������ �����ְ�
		 * ���� ������ ������ ����ϼ���.
		 * 
		 * ex.
		 * �ο� �� : 29
		 * ���� ���� : 100
		 * 1�δ� ���� ���� : 3
		 * ���� ���� ���� : 13
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candies = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + candies/people);
		System.out.println("���� ���� ���� : " + candies%people);
		
	}

}
