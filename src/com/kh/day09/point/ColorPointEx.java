package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5, 6, "blue");  // 기본 생성자가 없어서 발생하는 오류. 기본 생성자를 쓰거나 매개변수 생성자를 써야함!
		
		
		
//		cp.set(3, 4); //Point의 set()호출
//		cp.setColor("red"); //ColorPoint의 setColor()호출
		
		cp.showColorPoint();// 컬러와 좌표 출력
		
	}

}
