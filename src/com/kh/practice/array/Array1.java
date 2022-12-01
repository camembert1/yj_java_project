package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;


public class Array1 {

	public static void main(String[] args) {
		
		/*
		 * 배열 활용 1
		 * 
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고
		 * 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면
		 * 배열 전체 값을 출력하세요.
		 * 
		 * ex.
		 * 배열의 크기를 입력하세요 : 3
		 * 1번째 문자열 : 자바의 정석
		 * 2번째 문자열 : 알고리즘
		 * 3번째 문자열 : C프로그래밍
		 * 
		 * 
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 2
		 * 4번째 문자열 : 인간관계
		 * 5번째 문자열 : 자기계발
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 1
		 * 6번째 문자열 : 영단어600
		 * 더 값을 입력하시겠습니까?(Y/N) : n
		 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrNum = sc.nextInt();
		
		String[] arrs = new String[arrNum];
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("%d번째 문자열 : ", i+1);
			arrs[i] = sc.next();
		}
		System.out.println(Arrays.toString(arrs));
		
		ESCAPE :
		while (true) {
			System.out.print("값을 더 입력하시겠습니까? (Y / N) : ");
			char answer = sc.next().charAt(0);
			
			switch (answer) {
				case 'Y':
					System.out.print("더 입력하고 싶은 개수 : ");
					int arrPlusNum = sc.nextInt();
					
					String[] copyArrs = Arrays.copyOf(arrs, arrNum + arrPlusNum);
					for (int i = 0; i < arrNum; i++) {
						copyArrs[i] = arrs[i];
					}
					System.out.println(Arrays.toString(copyArrs));
					
					break;
					
				case 'N':
					System.out.println();
					break ESCAPE;

				default:
					System.out.println("Y 또는 N로 대답해 주세요.");
					break;
			}
			
			
		}
		
		System.out.println(Arrays.toString(arrs));
				
		
		// y면 얼마나 추가할지, 뭘 추가할지 물어보고 다시 돌아와서 또 더 추가하겠냐 물어보기
		// n면 지금 배열에 있는 값 보여주고 끝내기
		
		
		
		
		
		
		
		
	}

}
