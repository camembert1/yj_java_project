package com.kh.day10.interfaceex;


public interface PhoneInterface {
	public String NAME = ""; //�������̽����� private����,  ����� ��� ��Ģ �빮��!
	//�������ٴ� �� static�̶�� �ǹ� static�� �����Ǿ������� �� �� ����
	//	name = "Hello World"; //�� ���Ҵ� ���� ������̶� �ٲ��� ���� // static final�� �������ִ� ���� ��~
	public static final int TiME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public abstract void printLogo();  // {}�ٵ� ��� ����~
//	void printLogo();�� ���� ����
//	public�� �ᵵ ���� abstract�� �ᵵ ���� �� �� �ᵵ ���� �� ���ᵵ ����
	void displayNumber();
	public default void showLogo() {
		//����Ʈ�޼ҵ�, �����ϰ� ��ü�� ����� �� �ְ� �ϴ� �޼ҵ�
		//���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		//��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}