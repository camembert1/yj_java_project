package com.kh.day06.exercise;

import java.util.Scanner;


public class Exercise_ScoreProgram {

	public static void main(String[] args) {

	

		int kor = 0, eng = 0, math = 0;
		
		ESCAPE :  // break �ڿ� ����� ���α׷��� ������ ������ �� �ְ� ��
			      // ����ESCAPE�� �ƴϾ �� �ƹ��ų� ������� �����ֱ⸸ �ϸ� ��
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("====== ���� �޴� =======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			
			
			switch (select) {
				case 1:
					System.out.printf("%n====== ���� �Է� =======%n");
					System.out.print("���� : ");
					kor = sc.nextInt();
					System.out.print("���� : ");
					eng = sc.nextInt();
					System.out.print("���� : ");
					math = sc.nextInt();
					
					System.out.println();
					break;
					
				case 2:
					System.out.printf("%n====== ���� ��� =======%n");
					System.out.printf("���� : %d", kor);
					System.out.printf("%n���� : %d", eng);
					System.out.printf("%n���� : %d", math);
					System.out.println();
					
					int sum = kor + eng + math;
					double avg = (double)sum/3;
					System.out.printf("%n���� : %d", sum);
					System.out.printf("%n��� : %.2f", avg);
					System.out.printf("%n%n");
					
					break;
					
				case 3:
					System.out.println();
					System.out.println("Good Bye~");
					
					break ESCAPE;
					
				default :
					System.out.printf("%n1 ~ 3 ������ ���� �Է��� �ּ���!!%n%n");
					break;
					
				
			}
			
			
		}
		
		
		

		
		
	}
	

}
