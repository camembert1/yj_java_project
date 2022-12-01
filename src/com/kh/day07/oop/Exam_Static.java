package com.kh.day07.oop;

class StaticSample {
	
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	
	public void goodMethod() {
		input = 30; // 인풋 선언이 뒤에 됐는데 왜 오류 ㄴㄴ?
				    // 그것이 스태틱이니까.ㅋ
	}
	
	public static int input;
	public static void originMethod() {
		input = 5;
	}
	
}

public class Exam_Static {

	public static void main(String[] args) {
		// 메인 자체도 클래스에 있는 메소드인데
		// 여기에도 스태틱을 붙여서 ~ 메인이 원래 있던 것처러
		
		//new없이 사용할 수 있다<<스태틱의 핵심
		
//		StaticSample.num = 10;
		StaticSample.input = 10; // <<스태틱이다!
		
		StaticSample s1 = new StaticSample();
		System.out.println(s1.input); // 출력이 되는 걸 확인 가능
		
		s1.originMethod();
		System.out.println(s1.input); 
		
		int value = Math.abs(-7); // abs는 절댓값 구하는 거
		System.out.printf("값 : %d", value);

	}

}
