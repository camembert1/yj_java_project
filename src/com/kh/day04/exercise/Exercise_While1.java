package com.kh.day04.exercise;

public class Exercise_While1 {

	public static void main(String[] args) {
		
	//while문을 이용하여 1~100사이의 홀수의 합을 출력하시오.
		int sum = 0;
		
		int i = 1;
		while (i <= 100) {
			sum+=i;
			i+=2;
		}
	
		System.out.print(sum);
		
		
	
		
	}

}
