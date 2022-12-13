package com.kh.day15.listcollection;

public class RList<T> { //<T>���׸�,�ƹ��ų� �� ���� �� �ִٴ� ��
	private Object[] objects;
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) { // T
		objects[size] = input;
		size++;
	}
	
	// ���ϰ��� ������ ���ϰ��� �ڷ�����
	// �޼ҵ� ��ȯ���� ������
	public T get(int index) {  // T
		return (T)objects[index]; 
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}

