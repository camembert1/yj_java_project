package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		
		//����, �л� �߰��ϱ�~~
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		// 100���� �����ߴٸ� 100�� �� ����� ������������~
		
		
		
		
		List<Integer> list = null;
		//����Ʈ�� �������̽�~~
		// ArrayList�̿��غ���,
		//�������̽��� ��ӹ��� ���̹Ƿ�
		// ��ĳ���� ����
		list = new ArrayList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);

		int size = list.size();
		System.out.println("size : " + size);
		
		System.out.println("1��° �� : " + list.get(0));
	
		list.add(123);
		size = list.size();
		System.out.println("size : " + size);
		
//		list.clear();
//		size = list.size();
//		System.out.println("size : " + size);
		
		System.out.println("\n����ϰڽ��ϴ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "��° �� : " + list.get(i));
		}
		
		//���̿� ���� �ְ� ���� ��
		list.add(2,2022);
		//2�� �ε����� ���� ���� �ٸ� �͵��� �ڷ� �и�
		
		System.out.println("\nForeach�� ����ϰڽ��ϴ�");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}
		
		// �� ���� / 4�� �ε��� �����ϰ� �ʹٸ�
		list.set(4, 777);
		System.out.println("\nForeach�� �ٽ� ����ϰڽ��ϴ�");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}
		
		// �� ����
		list.remove(4);
		System.out.println("\nForeach�� �ٽ� ����ϰڽ��ϴ�");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}
		
		
	}
	
	public static void genericExample() {
		RList<Integer> list = new RList<Integer>();
		//�������� �� ���� ����µ� ���� �� ���ʤ���찡 ����
		// �� ���ڸ� �ְ�~~~
		
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);
		System.out.println("num : " + num);
		num = list.get(1);
		System.out.println("num : " + num);
		//������Ʈ����Ʈ ���� �ô� ����ȯ �߾�߉Ѥ���
		//integer��� ���ä����ϴϱ� ����ȯ ��� ��
	}
	
	public static void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("��");
		list.add(new Student());
		
		
		//object�� ���� �� �ݵ�� �ٿ�ĳ����
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		
		System.out.println("ù��° : " + num);
		System.out.println("�ι�° : " + word);
		System.out.println("����° : " + sOne);
		System.out.println("ũ�� : " + list.size());
		
		//�����ϱ�
		list.clear();
		System.out.println("ũ�� : " + list.size());
		
	}
	
	public static void intExample() {
		IntList list = new IntList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("ù��° : " + list.get(0));
		System.out.println("�ι�° : " + list.get(1));
		System.out.println("����° : " + list.get(2));
		System.out.println("ũ�� : " + list.size());
		
		//�����ϱ�
		list.clear();
		System.out.println("ũ�� : " + list.size());
	}

}
