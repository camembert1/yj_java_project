package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) { //person객체를 만나야 동작함
		// Person p = new Student(); //가 생략된 셈!
//		System.out.println("Person입니다!");
		
		//이제 student면 student라고 출력해달라 하고 싶음
		// 이때 instanceof연산자를 사용함!
		

		if(p instanceof Student) 
			System.out.println("Student입니다!");
		if(p instanceof Professor) {
			System.out.println("Professor입니다!");
		} else if(p instanceof Researcher)
			System.out.println("Researcher입니다!");
	}
	
	public static void main(String[] args) {
//		print(new Person());
		print(new Student()); //person이 아닌 것도 가능한 이ㅠ유는
		print(new Researcher()); //업캐스팅 됐기 때ㅜㄴ에!
		print(new Professor());// 자식객체를 넣어도 오류 발생하지 않음!
	}
}
