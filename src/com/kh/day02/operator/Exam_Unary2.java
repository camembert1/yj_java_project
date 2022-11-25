package com.kh.day02.operator;

public class Exam_Unary2 {
	public static void main (String [] args) {
		// b = (--a) + b;
		// c = (a++) + (--b);
		//연산자의 우선순위를 따져줘야 함~~~~~ sadas.java
		
		boolean result = true;
		System.out.println("result의 값 : " + result);
		
		System.out.println("부정연산자 not !");
		System.out.println("!result의 값 : " + !result);
		System.out.println("!!result의 값 : " + !!result);
		
	}

}
