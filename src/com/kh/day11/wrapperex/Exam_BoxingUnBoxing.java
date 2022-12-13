package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String[] args) {
		
		Integer num = Integer.valueOf(10);
	
		// 자동 Boxing
		Integer su = 100;
		
		// num객체에 있는 값을 기본형으로 바꿔서 다룰 수 있게 하기
		int soo = num.intValue();
		// 자동 UnBoxing
		soo = num;
		
		int n = 10;
		Integer intObject = n; // Boxing
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10; // UnBoxing Integer -> int 
		System.out.println("m = " + m);
		
		

	}

}
