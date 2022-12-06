package com.kh.day10.musicinterface;

public class StageRun {
	public static void main (String[] args) {
		Musician musician = new Musician();
		musician.playInstrument(new Piano());
		musician.playInstrument(new Guitar());
		musician.playInstrument(new Drum());
		//부모클래스 참조변수는 자식객체를 받을 수 있음 = 업캐스팅
	}
}
