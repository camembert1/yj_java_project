package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String[] args) {
		
		Integer num = Integer.valueOf(10);
	
		// �ڵ� Boxing
		Integer su = 100;
		
		// num��ü�� �ִ� ���� �⺻������ �ٲ㼭 �ٷ� �� �ְ� �ϱ�
		int soo = num.intValue();
		// �ڵ� UnBoxing
		soo = num;
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; // UnBoxing Integer -> int 
		System.out.println("m = " + m);
		
		

	}

}
