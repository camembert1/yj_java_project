package com.kh.day07.student;


public class StudentRun {
	
	public static void main (String [] args) {
		
		StudentFunction sFunction = new StudentFunction();
		
		ESCAPE :
		while(true) {
			//변수명이 리턴한 거랑 달라도 상관X choice -> input
			int input = sFunction.printMenu();
			System.out.println();
			
			switch (input) {
			case 1:
				sFunction.input();
				break;
			case 2:
				sFunction.print();
				break;
			case 3:
				
				break ESCAPE;

			default:
				break;
			}
		}
		
	}
	
	

}
