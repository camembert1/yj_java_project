package com.kh.day10.abstractex;

class Line extends Shape {

	@Override
	public void draw() {
		
	}
	
	//�������̵��� �ϰų� �߻�Ŭ������ ������ְų�~!~!
	
}

abstract public class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();
}
