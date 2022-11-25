package com.kh.day02.operator;

public class Exam_Logical2 {

	public static void main(String[] args) {
		
		System.out.println("논리연산자 예제2");
		int aNum = 70, bNum = 55;
		boolean result1, result2, result3, result4;
		result1 = (aNum == bNum) || (aNum++ < 100); // true, aNum = 71
		result2 = (aNum < bNum) && (--bNum < 55); // false **주의** 뒤에는 연산 안 함
		result3 = (aNum != bNum) && (bNum-- < aNum++); // true, aNum = 72, bNum = 54
		result4 = (aNum++ != bNum) || (bNum++ >= 85); // true, aNum = 73 **주의** 뒤에는 연산 안 함
		
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		
		System.out.println("aNum의 결과값 : " + aNum + " , bNum의 결과값 : " + bNum);
	}

}
