package com.kh.day10.interfaceex;


public interface PhoneInterface {
	public String NAME = ""; //인터페이스에서 privateㄴㄴ,  상수의 명명 규칙 대문자!
	//기울어졌다는 건 static이라는 의미 static이 생략되어있음을 알 수 있음
	//	name = "Hello World"; //값 재할당 ㄴㄴ 상수값이라 바뀌지 않음 // static final이 생략돼있다 보면 됨~
	public static final int TiME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void printLogo();  // {}바디 사용 금지~
//	void printLogo();로 생략 가능
//	public만 써도 ㄱㅊ abstract만 써도 ㄱㅊ 둘 다 써도 ㄱㅊ 아 ㄴ써도 ㄱㅊ
	void displayNumber();
	public default void showLogo() {
		//디폴트메소드, 유일하게 몸체를 사용할 수 있게 하는 메소드
		//하위 호환성을 위해서 작성한다.
		//즉, 하위 호환성을 유지하고 인터페이스의 보안을 위해 작성
		System.out.println("** LG **");
	}
}