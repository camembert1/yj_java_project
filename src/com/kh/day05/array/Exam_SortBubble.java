package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortBubble {

	public static void main(String[] args) {
		
		/*
		 * ���� �˰���
		 * 1. ���� ����
		 * 2. ���� ����
		 * 3. ���� ����
		 * 
		 * ���������̶�?
		 * ������ �� ���� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		 * ������ ���ٴ� ������ �ְ�,
		 * �̹� ���ĵ� �����͸� ������ �� ���� ����.
		 * �⺻������ �ٸ� ���Ŀ� ���� ���� �ӵ��� ������,
		 * �������� ������ �� ���� ����.
		 * 
		 * ���� ������ ����, ���� ū ������ ä��� ���!
		 */
		
		int[] arrs = {2, 5, 4, 1, 3};
		
		
		for (int i = 0; i < arrs.length-1; i++) {
			for (int j = 0; j < arrs.length-1-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int tmp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = tmp;
				}
				System.out.printf("i = %d, j = %d : ", i, j);
				System.out.println(Arrays.toString(arrs));
			}
		}
		
	}

}
