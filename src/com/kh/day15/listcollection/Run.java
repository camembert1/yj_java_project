package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		//응용, 학생 추가하기~~
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		// 100명을 저장했다면 100명 다 출력이 가능해지겠죠~
		
		
		
		
		List<Integer> list = null;
		//리스트는 인터페이스~~
		// ArrayList이용해보기,
		//인터페이스를 상속받은 것이므로
		// 업캐스팅 가능
		list = new ArrayList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);

		int size = list.size();
		System.out.println("size : " + size);
		
		System.out.println("1번째 값 : " + list.get(0));
	
		list.add(123);
		size = list.size();
		System.out.println("size : " + size);
		
//		list.clear();
//		size = list.size();
//		System.out.println("size : " + size);
		
		System.out.println("\n출력하겠습니다");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + list.get(i));
		}
		
		//사이에 값을 넣고 싶을 때
		list.add(2,2022);
		//2번 인덱스에 값이 들어가고 다른 것들은 뒤로 밀림
		
		System.out.println("\nForeach로 출력하겠습니다");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		
		// 값 수정 / 4번 인덱스 수정하고 싶다면
		list.set(4, 777);
		System.out.println("\nForeach로 다시 출력하겠습니다");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		
		// 값 제거
		list.remove(4);
		System.out.println("\nForeach로 다시 출력하겠습니다");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		
		
	}
	
	public static void genericExample() {
		RList<Integer> list = new RList<Integer>();
		//여러종류 다 쓰게 해줬는데 정작 다 쓰늦ㄴ경우가 없음
		// 걍 숫자만 넣게~~~
		
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);
		System.out.println("num : " + num);
		num = list.get(1);
		System.out.println("num : " + num);
		//오브젝트리스트 갖고 올댄 형변환 했어야됏ㄴ듣
		//integer라고 지ㅓㅈㅇ하니까 형변환 없어도 됨
	}
	
	public static void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student());
		
		
		//object는 꺼낼 때 반드시 다운캐스팅
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		
		System.out.println("첫번째 : " + num);
		System.out.println("두번째 : " + word);
		System.out.println("세번째 : " + sOne);
		System.out.println("크기 : " + list.size());
		
		//삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());
		
	}
	
	public static void intExample() {
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번째 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		
		//삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());
	}

}
