package com.kh.day10.interfaceex;

public class SamsungPhone  implements PhoneInterface {
	//extends����

	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Samsung =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx - xxxx - xxxx");
	}
	
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}
}
