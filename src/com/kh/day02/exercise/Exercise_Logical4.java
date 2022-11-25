package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical4 {

	public static void main(String[] args) {
		// 입력 받은 문자가 대문자인지 소문자인지 확인하세요!
		// 단, A라는 문자는 변수 word에 초기화해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해 주세요 > ");
		
		char word = sc.next().charAt(0);
		
		
		boolean result = ('A' <= word) && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
		
		//문제만 보고 처음부터 만들 수 있도록 연습
	}
}

