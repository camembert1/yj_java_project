package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		
		// 남자이면서 평균평점이 4.3이상인 사람 -> AND
		// 컴퓨터공학과 또는 경영학과인 사람    -> OR
		
		System.out.println("논리연산자 예제");
		int num1 = 50, num2 = 30;
		boolean result1, result2, result3, result4; //변수의 선언
		
		// num1과 num2가 다르면서 num2가 num1보다 클 때
		result1 = (num1 != num2) && (num2 > num1);
		System.out.println("result1의 결과값 : " + result1);
		
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		
	}

}
