package com.kh.day07.oop;

import java.util.Scanner;

public class Rectangle { // Ŭ���� ����, ���������� public
	
	public int width; // �ʺ�, ����, ���������� public
	public int height; // ����, ���� ���������� public
	
	// �޼ҵ�
	// ������ -> ��ü ����, ��ü �ʱ�ȭ(�ʵ��ʱ�ȭ)
	public Rectangle() {} // ������, ���������� public�̰� ��ȯ�� ��
	
	
	// �Ű����� �ִ� ������(���ް��� ���� �� �ִ� ������)
	public Rectangle(int w, int height) {
		this.width = w;
		this.height = height;
		// this�� ���� ���� :  �� �����ִ� height��~��� �ˤ����ִ°���
	}
	
	public int getArea() {
		return width * height;
	}
	
	
}
