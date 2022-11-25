package com.kh.day02.variable;

public class TestVariable {

	public static void main(String[] args) {
		
//		자료형 변수명 대입연산자 데이터;
		int kh = 34;
		String msg = "Hello World";
		
		int num; //변수의 선언
		num = 100; //변수의 초기화, 초기화를 하지 않으면 사용불가
		
		System.out.println("kh");
		
		System.out.println(kh);
		System.out.println(msg);
		System.out.println(num);
		
		num = 101; //변수의 초기화
		System.out.println(num);

		num = num + 1;
		System.out.println(num);
		
	}

}