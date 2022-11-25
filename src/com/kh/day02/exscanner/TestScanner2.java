package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main (String [] args) {
		
		//입력 받을 수 있는 데이터는
		// 정수, 실수, 문자열, 문자(*특이함 기억할 필요 ㅇㅇ 시험에 나올 수 있음)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 > ");
		int iNum = sc.nextInt();
		System.out.println("입력한 정수 : " + iNum);
		
		System.out.print("실수를 입력해 주세요 > ");
		double dNum = sc.nextDouble();
		System.out.println("입력한 실수 : " + dNum);
		
		System.out.print("문자열을 입력해 주세요 > ");
		String words = sc.next(); //주의 nextString이런거 없음
		System.out.println("입력한 문자열 : " + words);
		
		System.out.print("문자를 입력해 주세요 > ");
		char word = sc.next().charAt(0);
		// 주의 nextChar 없음
		// 입력 받은 문자열에서 인덱스값0 즉 첫번째값만 자르겠다는 말임
		System.out.println("입력한 문자 : " + word);
			
	}

}
