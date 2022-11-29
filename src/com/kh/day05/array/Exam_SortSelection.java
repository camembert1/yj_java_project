package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortSelection {

	public static void main(String[] args) {
		
		/*
		 * ���� �˰���
		 * 1. ���� ����
		 * 2. ���� ����
		 * 3. ���� ����
		 * 
		 * ���������̶�?
		 * �迭�� ���� �˻��Ͽ� �ּڰ��� ����
		 * ���ʺ��� ä�������� ����� ����
		 * Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		 * ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		 * �迭�� n�� �ε������� n+1�� ~ ������ �ε������� ����.
		 */
		
		int[] arrs = {2, 5, 4, 1, 3};
		int min; // �ε����� ������ ���� 1�� �ε����� 3�� �����
		
		for (int i = 0; i < arrs.length; i++) {
			min = i; // ���� ���� �� �ε��� ��
			for (int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
				System.out.printf("i = %d, j = %d, min = %d : ", i, j, min);
				System.out.println(Arrays.toString(arrs));
				
			}
			int tmp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = tmp;
			
			System.out.printf("			");
			System.out.println(Arrays.toString(arrs));
			System.out.println();
		}
		/*
		 * ����!�������վ�??�ٲ�.
		 * i=0�϶�,
		 * 1, 5, 4, 2, 3 //ù��° ���
		 * i=1�϶�,
		 * 1, 2, 4, 5, 3 // �ι�° ���
		 */
		
		
	}

}
