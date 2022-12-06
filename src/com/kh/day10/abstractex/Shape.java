package com.kh.day10.abstractex;

class Line extends Shape {

	@Override
	public void draw() {
		
	}
	
	//오버라이딩을 하거나 추상클래스로 만들어주거나~!~!
	
}

abstract public class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();
}
