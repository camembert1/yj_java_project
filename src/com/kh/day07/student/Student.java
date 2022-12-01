package com.kh.day07.student;

public class Student {

	private String name;	
	private int kor;	
	private int eng;	
	private int math;	

	public Student() {}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	// 2. StudentFunction에서 객체를 한번 더 생성하는 것을 안하려고 하는 방법
	// 위에는 한번에?뭐래캣지
	//아 셋메소드는 한개씩 넣는거다~~
	// setter메소드 
	// 멤버변수 각각 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//getter메소드
	//멤버변수 값 리턴	
	// 1. private값 사용하게 해주기 위해 메소드 사용
	// 캡슐화 되어있는 데이터는 메소드를 통해 저장 접근함
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return kor; //this안써도됨
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return math;
	}
	
}
