package com.kh.day07.oop;

class Sample {
	
	public int a;
	private int b;
	int c;
	
}


public class Exam_Access {
	
	public static void main (String [] args) {
		
		Sample sp = new Sample();
		sp.a = 10; // ���� �����ϴ�. public�̴ϱ�.
	//	sp.b = 10; // is not visible, �Ұ����ϴ�. private�̴ϱ�.
		sp.c = 10; // ���� �����ϴ�. default�ϱ�.
		
	}

}

