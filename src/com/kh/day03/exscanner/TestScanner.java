package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요. > ");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해 주세요. > ");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해 주세요. > ");
		double height = sc.nextDouble();
		                
		System.out.println("성별을 입력해 주세요. > ");
		String gender = sc.next();
		                
		System.out.println("주소를 입력해 주세요. > ");
		sc.nextLine(); //엔터 제거를 위함~
		String address = sc.nextLine();
		
		System.out.printf("\n이름은 %s입니다.\n",name);
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 " + address + "입니다.");
	
	}
}
