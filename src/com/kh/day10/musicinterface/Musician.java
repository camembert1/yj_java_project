package com.kh.day10.musicinterface;

public class Musician {
//	public void playInstrement(Piano piano) {
//		piano.play();
//	}
//	public void playInstrement(Guitar guitar) {
//		guitar.play();
//	}
//	public void playInstrement(Drum drum) {
//		drum.play();
//	}
	
	//3���� �ϳ���(�Ǳ���� �� �������̽��� ��ӹ���)
	
	public void playInstrument(Instrument instrument) {
		instrument.play();
		instrument.makeSound();
	}
	
}
