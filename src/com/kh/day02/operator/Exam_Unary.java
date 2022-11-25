package com.kh.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
	
		// 단항연산자, 이항연산자
		// a++, a--, b++, b--
		// ++a, --a, ++b, --b
		// a = a + 1 , a = a - 1 , b = b + 1 , b = b - 1

		int a = 1;
		System.out.println(a++); // 후위연산(나중연산)
		System.out.println(a);

		a = 1;
		System.out.println(++a); // 전위연산(먼저연산)
		
	}

}