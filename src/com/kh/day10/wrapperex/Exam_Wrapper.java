package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
		// Integer i = new Integer(11230) //못쓰는놈~~
		
		Integer i = Integer.valueOf(1123);
		System.out.println(i);
		
		// 객체로 만들어서 사용하다가 기본형으로 돌아가서 사용할 수도 있다~!~!~!
		int e = i.intValue();
		System.out.println(e);
		
		// 그럼 기본형으로 쓰지 왜 객체로 만들어서 씀??
		Integer f = null;  // 이런 게 가능해짐~!
//		int m = null; //얜 안댐`!~!~~
		
		Character c = Character.valueOf('c');
		char che = c.charValue(); //객체로 ㅏㄴ들어서 사용하다가 기본형으로 전환
		System.out.println(che);
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();  //객체로 만들어서 사용하다가 기본형으로 전환
		System.out.println(dd); 
		
		//문자열을 기본 데이터 타입(int, boolean, double 등)으로 변환
		int num = Integer.parseInt("123");
		System.out.println("변환된 값 : " + num);
		boolean isYn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		//기본 데이터 타입(int, double, char 등)을 문자열로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123);//16진수 7b로 변환
		System.out.println(data2);
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
	}
}
