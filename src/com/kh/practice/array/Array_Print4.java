package com.kh.practice.array;

import java.util.Scanner;

public class Array_Print4 {

	public static void main(String[] args) {
		
		/*
		 * 배열출력4
		 * 길이가 5인 String배열을 선언하고
		 * “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		 * 배열 인덱스를 활용해서 귤을 출력하세요.
		 * 
		 * ex.
		 * 귤
		 */
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("귤")) {
				System.out.println(fruits[i]);
			}
		}
		
	}

}
