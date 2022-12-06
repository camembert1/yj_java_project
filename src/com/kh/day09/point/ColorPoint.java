package com.kh.day09.point;

public class ColorPoint extends Point {
	
	private String color; //점의 색
	
//	public ColorPoint() {}
	
	public ColorPoint(int x, int y, String color) {
		//x, y세팅
		super(x, y); // 생성자 선택하기 point클래스 참고~! 생성자 선택은 역시 super~!~!~ㅋ
		
		this.color = color;
	}
	
//	public void setColor(String color) {
//		this.color = color;
//	}
	
	public void showColorPoint() { //색, 좌표출력
		System.out.println(color);
		showPoint(); //Point클래스의 showPoint를 호출
	}
}
