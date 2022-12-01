package com.kh.day07.oop;

public class Circle { // 클래스 선언, 클래스 접근 권한은 public
	
	// 필드 
	public int radius; // 접근 지정자 public
	public String name; // 접근 지정자 public
	
	
	//메소드
	// public Circle() {}
	// 클래스명과 이름이 같은 메소드
	// 1. -> 생성자! 반환형이 없음
	// 2. 객체생성
	// 3. 필드 초기화 .위에 있는 필드에 있는 값 넣어주기!
	// 안 적어도 됨. 생략 가능.	
	public Circle() { // 접근 지정자 public
		
		this.radius = 1;
		this.name = "원";
		
	}
	//이게 원칙 but 필드에서 바로
	// public int radius = 1; 이렇게 해도됨
	// 근데 수업 들을땐 걍 원칙대로
	// 초기화는 생성자에서 해보자`~~!!
	
	public double getArea() { // 접근 지정자 public 반환값이 있으므로 반환형이 있음
		return 3.14 * radius * radius; //리턴이라는 키워드가 있으면 void라고 적으면 안됨
	}										//리턴값의 자료형을 써줘야함 double
	
}
