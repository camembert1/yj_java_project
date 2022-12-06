package com.kh.day09.overloading;

class Weapon {
	
	
	//�����ڸ޼ҵ� - �����ε��� ����
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

	@Override //������ �Ȱ���!, ������ ����!!
	protected int fire() {
		return 10;
	}
	
	//�����ε� �̸��� �Ȱ���!
	//�ڱ� �ڽſ��� ����, �Ű����� Ÿ�� or ������ �޶���! 
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
		
		// println�� �����ε��� ���� - �����ε��� ����? �Ȱ��� �̸��� �� �� ����1!
		// printint printstr �̷������� ��ߵ�������~!~!~ �����ε��� ���ٸ�~!~!~~
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
		
	}

}