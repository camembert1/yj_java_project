package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.Exercise_Lotto3();
		
		Person person = new Person(); // 메모리에 올리는 과정
									  // 객체 생성할 때 사용했던게 생성자였음!
									  // 메소드이면서 new키워드와 함께 쓰면 ~ 객체 생성~
		
		person.eat();
		person.sleep();
		person.speak();
		person.walking();
		
//		person.name = "일용자";
//		person.jobName = "의사";
		
		
		// 레퍼런스 변수 선언
		// 참조 변수 선언
		// 주소가 저장되는 변수
		Rectangle rect = new Rectangle();  // 객체생성, 반드시 new 키워드 이용!
										   // new는 객체 생성자 Rectangle()호출한 거나 마찬가지!! 객체생성의 비밀 ㄷ.ㄷ
		Scanner sc = new Scanner(System.in);
		
		System.out.print("너비를 입력해 주세요 >> ");
		//객체의 멤버 접근(멤버의 종류로는 멤버변수와 멤버메소드가 있음)
		//인스턴스라고 하기도 함(Rectangle 클래스의 객체라는 뜻임!)
		rect.width = sc.nextInt(); // 객체의 멤버 접근은 .으로 한다. 멤버변수 접근
		System.out.print("높이를 입력해 주세요 >> "); 
		rect.height = sc.nextInt(); // 멤버변수접근
		
		System.out.printf("사각형의 넓이 : %d", rect.getArea()); // 멤버메소드 접근
		
		
	}

}
