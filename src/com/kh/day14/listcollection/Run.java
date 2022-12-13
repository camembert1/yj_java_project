package com.kh.day14.listcollection;


public class Run {

	public static void main(String[] args) {
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("월");
//		objList.add(23);
//		objList.add("일");
		objList.add(new Student()); //다~~ 가능
		
		// 리턴 타입은 오브젝트인데 받는 타입이 int, string, student
		int num = (int)objList.get(0); // 오류 나는 이유, 11의 타입이 object임
		// 즉 업캐스팅 된 상태로 가져온 거
		// 따라서 강제형변환 (다운캐스팅)
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);
		
		// 다양한 자료형을 사용할 수 있으며
		// 꺼내서 쓸 때는 다운캐스팅(형변환) 해줘야 한다
		
	}
	
	public void intExample() {
		IntList nums = new IntList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("1번째 값 : " + nums.get(0));
		System.out.println("2번째 값 : " + nums.get(1));
		System.out.println("3번째 값 : " + nums.get(2));
		System.out.println("4번째 값 : " + nums.get(3));
		System.out.println("크기 : " + nums.size());
		
		//값 삭제
		nums.clear();
		System.out.println("삭제 후 크기 : " + nums.size());
		System.out.println("완료");
	}

}
