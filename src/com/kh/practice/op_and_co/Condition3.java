package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {

			/*
			 * �����Ǻ�3
			 * 
			 * A, B, C ����� ������ �Է� �ް�
			 * �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
			 * �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�
			 * �̸��̸� ��3000 �̸����� ����ϼ���.
			 * (A ����� �μ�Ƽ��� 0.4,
			 * B ����� �μ�Ƽ��� ������,
			 * C ����� �μ�Ƽ��� 0.15)
			 * 
			 * ex.
			 * A����� ���� : 2500
			 * B����� ���� : 2900
			 * C����� ���� : 2600
			 * A��� ����/����+a : 2500/3500.0
			 * 3000 �̻�
			 * B��� ����/����+a : 2900/2900.0
			 * 3000 �̸�
			 * C��� ����/����+a : 2600/2989.9999999999995
			 * 3000 �̸�
			 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int workerA = sc.nextInt();
	
		System.out.print("B����� ���� : ");
		int workerB = sc.nextInt();

		System.out.print("C����� ���� : ");
		int workerC = sc.nextInt();
	
		double workerAi = workerA*1.4,
				workerBi = workerB*1,
				workerCi = workerC*1.15;
		
		System.out.println("A��� ����/����+a : " + workerA + "/" + workerAi);
		System.out.println((workerAi >= 3000) ? "3000 �̻�" : "3000 �̸�");
	
		System.out.println("B��� ����/����+a : " + workerB + "/" + workerBi);
		System.out.println((workerBi >= 3000) ? "3000 �̻�" : "3000 �̸�");
		
		System.out.println("C��� ����/����+a : " + workerC + "/" + workerCi);
		System.out.println((workerCi >= 3000) ? "3000 �̻�" : "3000 �̸�");
	}
}
