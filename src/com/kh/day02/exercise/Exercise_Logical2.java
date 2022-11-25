package com.kh.day02.exercise;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// 문자 A가 대문자인지 소문자인지 확인하세요!
		// 단, A라는 문자는 변수 word에 초기화해주세요.
		char word = 'A';
		
		System.out.println("영어 대문자 확인 : " + Character.isUpperCase(word));
		
		boolean result = (65 <= word) && (word <= 90);
		System.out.println("영어 대문자 확인 : " + result);
		
		result = ('A' <= word) && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}
}
