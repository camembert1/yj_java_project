package com.kh.day07.oop;

class Sample {
	
	public int a;
	private int b;
	int c;
	
}


public class Exam_Access {
	
	public static void main (String [] args) {
		
		Sample sp = new Sample();
		sp.a = 10; // 접근 가능하다. public이니까.
	//	sp.b = 10; // is not visible, 불가능하다. private이니까.
		sp.c = 10; // 접근 가능하다. default니까.
		
	}

}

