package com.kh.day07.oop;

public class Circle { // Ŭ���� ����, Ŭ���� ���� ������ public
	
	// �ʵ� 
	public int radius; // ���� ������ public
	public String name; // ���� ������ public
	
	
	//�޼ҵ�
	// public Circle() {}
	// Ŭ������� �̸��� ���� �޼ҵ�
	// 1. -> ������! ��ȯ���� ����
	// 2. ��ü����
	// 3. �ʵ� �ʱ�ȭ .���� �ִ� �ʵ忡 �ִ� �� �־��ֱ�!
	// �� ��� ��. ���� ����.	
	public Circle() { // ���� ������ public
		
		this.radius = 1;
		this.name = "��";
		
	}
	//�̰� ��Ģ but �ʵ忡�� �ٷ�
	// public int radius = 1; �̷��� �ص���
	// �ٵ� ���� ������ �� ��Ģ���
	// �ʱ�ȭ�� �����ڿ��� �غ���`~~!!
	
	public double getArea() { // ���� ������ public ��ȯ���� �����Ƿ� ��ȯ���� ����
		return 3.14 * radius * radius; //�����̶�� Ű���尡 ������ void��� ������ �ȵ�
	}										//���ϰ��� �ڷ����� ������� double
	
}
