package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {
		//��ü�������α׷���!!
		
		Scanner sc = new Scanner(System.in);
		
		ScoreFunction sFunction = new ScoreFunction();  
		// while�� �ȿ� ������ �ȵ� ��� �Է°� �ʱ�ȭ�ɰ���
		// ���� �ϴ� �Ǽ�!!
				
		ESCAPE :
		while(true) {
			int choice = sFunction.printMenu(); //���⼭ ��ĳ�� �� ����!
			switch (choice) {
				case 1: 
					sFunction.input();
					break;
				case 2: 
					sFunction.print();
					break;
				case 3:
					sFunction.end();
					break ESCAPE ;
				default : 
					sFunction.except();
					break;
			}
		}		
		
	}

}
