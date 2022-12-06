package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("일용자");
		
//		p = new Person(""); //이건 그냥 객체 생성
		p = s; //업캐스팅
		
		
		System.out.println(p.name);
//		System.out.println(p.grade); // 자식이 갖가ㅗ 있는 멤버를 부르면 오류가 발생한다
	
		//다운캐스팅
		// 강제 형변환 늒낌~!~!
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	
	}
}
