package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {

	public static void main(String[] args) {
		//객체지향프로그래밍!!
		
		Scanner sc = new Scanner(System.in);
		
		ScoreFunction sFunction = new ScoreFunction();  
		// while문 안에 넣으면 안됨 계속 입력값 초기화될거임
		// 많이 하는 실수!!
				
		ESCAPE :
		while(true) {
			int choice = sFunction.printMenu(); //여기서 스캐너 안 쓰기!
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
