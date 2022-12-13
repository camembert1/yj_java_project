package com.kh.day11.exercise;

import java.util.Arrays;

public class Exercise_Wrapper {

	public static void parserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		System.out.println(Integer.parseInt(strNum2) - Integer.parseInt(strNum));
		
	
	}
	
	public static void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		
		// 1. strData를 byte short int long으로 변환
		System.out.println(Byte.parseByte(strData));
		System.out.println(Short.parseShort(strData));
		System.out.println(Integer.parseInt(strData));
		System.out.println(Long.parseLong(strData));
		
		
		// 2. strData2를 float double로 변환
		System.out.println(Float.parseFloat(strData2));
		System.out.println(Double.parseDouble(strData2));
		
		// 3. strData3를 char로 변환
		char[] testChar = strData3.toCharArray();
		System.out.println(Arrays.toString(testChar));
		
		char word = strData3.charAt(0);
		System.out.println(word);
		
	}
	
	public static void main (String[] args) {
		parserExample();
		dataParsingExample();
	}

}


