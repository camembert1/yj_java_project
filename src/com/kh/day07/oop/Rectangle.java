package com.kh.day07.oop;

import java.util.Scanner;

public class Rectangle { // 클래스 선언, 접근지정자 public
	
	public int width; // 너비, 가로, 접근지정자 public
	public int height; // 높이, 세로 접근지정자 public
	
	// 메소드
	// 생성자 -> 객체 생성, 객체 초기화(필드초기화)
	public Rectangle() {} // 생성자, 접근지정자 public이고 반환형 없
	
	
	// 매개변수 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int w, int height) {
		this.width = w;
		this.height = height;
		// this를 쓴ㄴ 이유 :  저 위에있는 height야~라고 알ㄹ려주는거임
	}
	
	public int getArea() {
		return width * height;
	}
	
	
}
