package com.kh.practice.array;

import java.util.Scanner;

public class Array_Print4 {

	public static void main(String[] args) {
		
		/*
		 * �迭���4
		 * ���̰� 5�� String�迭�� �����ϰ�
		 * �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
		 * �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
		 * 
		 * ex.
		 * ��
		 */
		
		String[] fruits = {"���", "��", "����", "������", "����"};
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("��")) {
				System.out.println(fruits[i]);
			}
		}
		
	}

}
