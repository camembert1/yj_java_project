package com.kh.day09.insof;

public class InstanceOfEx {
	
	static void print(Person p) { //person��ü�� ������ ������
		// Person p = new Student(); //�� ������ ��!
//		System.out.println("Person�Դϴ�!");
		
		//���� student�� student��� ����ش޶� �ϰ� ����
		// �̶� instanceof�����ڸ� �����!
		

		if(p instanceof Student) 
			System.out.println("Student�Դϴ�!");
		if(p instanceof Professor) {
			System.out.println("Professor�Դϴ�!");
		} else if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�!");
	}
	
	public static void main(String[] args) {
//		print(new Person());
		print(new Student()); //person�� �ƴ� �͵� ������ �̤�����
		print(new Researcher()); //��ĳ���� �Ʊ� ���̤���!
		print(new Professor());// �ڽİ�ü�� �־ ���� �߻����� ����!
	}
}
