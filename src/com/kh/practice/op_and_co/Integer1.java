package com.kh.practice.op_and_co;

import java.util.Scanner;

public class Integer1 {

	public static void main(String[] args) {
		
		/*
		 * �����Ǻ�1
		 * 
		 * Ű����� �Է� ���� �ϳ��� ������
		 * ����̸� ������١�
		 * ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�
		 * 0�� �ƴϸ� �������١��� ����ϼ���.
		 * 
		 * ex.
		 * ���� : -9
		 * ������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("�����");
		} else if (num == 0) {
			System.out.println("0�̴�");
		} else {
			System.out.println("������");
		}
	}

}
