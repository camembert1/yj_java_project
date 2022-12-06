package com.kh.day09.overloading;

class Weapon {
	
	
	//생성자메소드 - 오버로딩의 예시
	public Weapon() {}
	
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {

	@Override //완전히 똑같음!, 다형성 실현!!
	protected int fire() {
		return 10;
	}
	
	//오버로딩 이름만 똑같음!
	//자기 자신에게 복붙, 매개변수 타입 or 개수가 달라짐! 
	protected int fire(int steampack) {
		return steampack*100;
	}
	
	protected int fire(int steampack, int medicine) {
		return steampack+medicine;
	}
	
	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
}


public class MethodOverloadingEx {

	public static void main(String[] args) {
		
		// println도 오버로딩의 예시 - 오버로딩이 없다? 똑같은 이름을 쓸 수 없다1!
		// printint printstr 이런식으로 써야됐을수도~!~!~ 오버로딩이 없다면~!~!~~
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
		
	}

}
