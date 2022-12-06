package com.kh.day08.oop;



class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}

	
}
	
	
public class CircleArray {
	
	public static void main (String [] args) {
		Circle[] c = new Circle[5]; //여기 뉴는 화살표 생긴거 아님!~!
		
		//객체 생성 및 초기화
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);  // 이때 화살표가 생기는 거다~~ 참조가된다
		}
		
		//객체 배열 출력
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
			System.out.println((int)c[i].getArea()); //강제형변환
		}
	}

}
