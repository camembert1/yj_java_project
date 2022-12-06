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
	
	//3개를 하나로(악기들이 다 인터페이스를 상속받음)
	
	public void playInstrument(Instrument instrument) {
		instrument.play();
		instrument.makeSound();
	}
	
}
