package com.kh.day11.wrapperex;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		Integer su = Integer.valueOf(10);
		Integer sooInteger = new Integer(0); // 사라짐, 쓰는 걸 권장하지 않음
		
		
		// 글자가 누워있다 = static메소드다 = 객체 생성 없이 바로 불러와서 쓸 수 있다.
		System.out.println(Character.toLowerCase('A'));  //소문자로
		System.out.println(Character.toUpperCase('a'));
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) {  // 숫자인지 체크
			System.out.println(c1 + "은 숫자");
		}
		if (Character.isAlphabetic(c2)) {  // 문자인지 체크
			System.out.println(c2 + "는 영문자");
		}
		
		
		
		
		
		
	}
}
