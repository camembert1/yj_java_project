package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;


public class Array1 {

	public static void main(String[] args) {
		
		/*
		 * �迭 Ȱ�� 1
		 * 
		 * ����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		 * �迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
		 * ��, ����ڿ��� �迭�� ���� �� ������ �����
		 * �� ���� �� �Է��� ����,
		 * �ø� ���� � �����͸� ���� ������ ��������.
		 * ����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ�
		 * �迭 ��ü ���� ����ϼ���.
		 * 
		 * ex.
		 * �迭�� ũ�⸦ �Է��ϼ��� : 3
		 * 1��° ���ڿ� : �ڹ��� ����
		 * 2��° ���ڿ� : �˰���
		 * 3��° ���ڿ� : C���α׷���
		 * 
		 * 
		 * �� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : y
		 * �� �Է��ϰ� ���� ���� : 2
		 * 4��° ���ڿ� : �ΰ�����
		 * 5��° ���ڿ� : �ڱ���
		 * �� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : y
		 * �� �Է��ϰ� ���� ���� : 1
		 * 6��° ���ڿ� : ���ܾ�600
		 * �� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : n
		 * [�ڹ��� ����, �˰���, C���α׷���, �ΰ�����, �ڱ���, ���ܾ�600]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int arrNum = sc.nextInt();
		
		String[] arrs = new String[arrNum];
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("%d��° ���ڿ� : ", i+1);
			arrs[i] = sc.next();
		}
		System.out.println(Arrays.toString(arrs));
		
		ESCAPE :
		while (true) {
			System.out.print("���� �� �Է��Ͻðڽ��ϱ�? (Y / N) : ");
			char answer = sc.next().charAt(0);
			
			switch (answer) {
				case 'Y':
					System.out.print("�� �Է��ϰ� ���� ���� : ");
					int arrPlusNum = sc.nextInt();
					
					String[] copyArrs = Arrays.copyOf(arrs, arrNum + arrPlusNum);
					for (int i = 0; i < arrNum; i++) {
						copyArrs[i] = arrs[i];
					}
					System.out.println(Arrays.toString(copyArrs));
					
					break;
					
				case 'N':
					System.out.println();
					break ESCAPE;

				default:
					System.out.println("Y �Ǵ� N�� ����� �ּ���.");
					break;
			}
			
			
		}
		
		System.out.println(Arrays.toString(arrs));
				
		
		// y�� �󸶳� �߰�����, �� �߰����� ����� �ٽ� ���ƿͼ� �� �� �߰��ϰڳ� �����
		// n�� ���� �迭�� �ִ� �� �����ְ� ������
		
		
		
		
		
		
		
		
	}

}
