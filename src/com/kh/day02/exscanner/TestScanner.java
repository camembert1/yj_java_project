package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용하기
		
		System.out.print("int 값을 입력해주세요 > ");
		int input1 = sc.nextInt(); // 입력 받은 값을 저장
		System.out.println("입력한 값 : " + input1);
		
		System.out.print("int 값을 한 번 더 입력해 주세요 > ");
		int input2 = sc.nextInt();
		System.out.println("입력한 값 : " + input2);
		
		// print와 println 차이 ln = 개행을 포함함, 줄 넘김
		// 화면을 똑같이 구현할 때 차이 주의하기!
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 " + result + " 입니다.");
		
//		sc.close();
		// 이제 스캐너 다 썼다는 코드인데 안 써도 상관 없음, 생략 가능
		//잘못 닫으면 입력이 되지 않기 때문에~~ 좀 더 실력을 쌓고 사용!
		
	}

}
