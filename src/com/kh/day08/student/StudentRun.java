package com.kh.day08.student;

public class StudentRun {

	public static void main(String[] args) {
		
		StudentFunction2 sFunction = new StudentFunction2();
		
		ESCAPE:
		while(true) {
			int choice = sFunction.printMenu();
			switch (choice) {
			case 1:
				sFunction.inputScore();
				break;
			case 2:
				sFunction.printScore();
				break;
			case 3:
				sFunction.checkPass();
				break;
			case 4:
				sFunction.printGoodBye();
				break ESCAPE;
			default:
				sFunction.printExceptioin();
				break;
			}
		}
		
	}

}
