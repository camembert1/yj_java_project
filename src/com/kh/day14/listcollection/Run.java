package com.kh.day14.listcollection;


public class Run {

	public static void main(String[] args) {
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("��");
//		objList.add(23);
//		objList.add("��");
		objList.add(new Student()); //��~~ ����
		
		// ���� Ÿ���� ������Ʈ�ε� �޴� Ÿ���� int, string, student
		int num = (int)objList.get(0); // ���� ���� ����, 11�� Ÿ���� object��
		// �� ��ĳ���� �� ���·� ������ ��
		// ���� ��������ȯ (�ٿ�ĳ����)
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);
		
		// �پ��� �ڷ����� ����� �� ������
		// ������ �� ���� �ٿ�ĳ����(����ȯ) ����� �Ѵ�
		
	}
	
	public void intExample() {
		IntList nums = new IntList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("1��° �� : " + nums.get(0));
		System.out.println("2��° �� : " + nums.get(1));
		System.out.println("3��° �� : " + nums.get(2));
		System.out.println("4��° �� : " + nums.get(3));
		System.out.println("ũ�� : " + nums.size());
		
		//�� ����
		nums.clear();
		System.out.println("���� �� ũ�� : " + nums.size());
		System.out.println("�Ϸ�");
	}

}
