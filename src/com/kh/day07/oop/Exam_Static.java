package com.kh.day07.oop;

class StaticSample {
	
	public int num;
	public void sampleMethod() {
		input = 20;
	}
	
	public void goodMethod() {
		input = 30; // ��ǲ ������ �ڿ� �ƴµ� �� ���� ����?
				    // �װ��� ����ƽ�̴ϱ�.��
	}
	
	public static int input;
	public static void originMethod() {
		input = 5;
	}
	
}

public class Exam_Static {

	public static void main(String[] args) {
		// ���� ��ü�� Ŭ������ �ִ� �޼ҵ��ε�
		// ���⿡�� ����ƽ�� �ٿ��� ~ ������ ���� �ִ� ��ó��
		
		//new���� ����� �� �ִ�<<����ƽ�� �ٽ�
		
//		StaticSample.num = 10;
		StaticSample.input = 10; // <<����ƽ�̴�!
		
		StaticSample s1 = new StaticSample();
		System.out.println(s1.input); // ����� �Ǵ� �� Ȯ�� ����
		
		s1.originMethod();
		System.out.println(s1.input); 
		
		int value = Math.abs(-7); // abs�� ���� ���ϴ� ��
		System.out.printf("�� : %d", value);

	}

}
