package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		// Shape p = new Line();이나 마찬가지다~!~!
		p.draw(); //원래는 부모께 나와야 하지ㅏㄴ line객체가 생성되었기 때문에~~ 동적바인딩 되었다
	}
	
	public static void main(String[] args) {
		Line line = new Line();
//		line.draw();
		paint(line);
		
		//오버라이딩 안 한 것들
		paint(new Rect());
		paint(new Circle());
	}

}
