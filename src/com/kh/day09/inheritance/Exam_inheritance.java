package com.kh.day09.inheritance;

import com.kh.day09.point.Point; //클래스 임포트함!! 다른 패키지에 있는 클래스

class Black extends Point {
	
}

class BlackPoint extends Point {
	void set() {  //부모의 멤버변수는 메소드 안에서!
	
//		def = 2; //다른 패키지에 있으니까 디폴트 안됨!!!
	}
	
}


class Child extends Parent {
	void set() {
		//부모의 멤버변수 사용하기~!
		pub = 1;
		def = 2;
		pro = 3;
//		pri = 4; //The field Parent.pri is not visible
	}
}

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	  
	private int money = 2000;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
}

public class Exam_inheritance {
	public static void main (String[] args) {
		
		Child child = new Child();
		
		child.setMoney(3000);
		System.out.println("Parent money : " + child.getMoney());
		
	}

}
